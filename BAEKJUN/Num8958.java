package com.github.BAEKJUN;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[] arr = new String[N];
        for (int i = 0; i < N; i++){
            arr[i] = br.readLine(); // arr[0] oxxoxoxo 들어감 String 타입으로.
        }

        for (int i=0; i<N; i++){
            int cnt = 0; // 누적횟수를 세는 걸
            int sum = 0; // 카운트한 누적횟수를 더할 변수 sum+= cnt;
            for (int j = 0; j<arr[i].length(); j++){
                if (arr[i].charAt(j) == 'O'){
                    cnt++;
                } else {
                    cnt=0;
                }
                sum += cnt;
            }
            System.out.print(sum);
            System.out.println();
        }
    }
}