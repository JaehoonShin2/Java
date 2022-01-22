package com.github.BAEKJUN;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;

        while (true) {
            if (N % 5 == 0) {
                System.out.println(N/5 + cnt);
                break;
            }
            N -= 3;
            cnt++;
            if(N < 0){
                System.out.println(-1);
                break;
            }
        }
    }
}
