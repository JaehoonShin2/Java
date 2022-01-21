package com.github.BAEKJUN;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        // k = 층수
        // n = 호실 수
        // k층의 n호실에 살기 위해서는 k-1층의 1~n호실까지
        int[][] arr = new int[15][15];
        for (int i = 0; i < 15; i++) {
            arr[i][1] = 1;
            arr[0][i] = i;
        }

        for (int i = 0; i < T; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            for (int j = 1; j < 15; j++) { // 층수
                for (int l = 2; l < 15; l++) { // 호실
                    arr[j][l] = arr[j][l-1] + arr[j-1][l];
                }
            }
            System.out.println(arr[k][n]);

        }
    }
}
