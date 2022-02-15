package com.algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Num019_2522 {

    public static void main(String[] args) throws IOException {

        star1();
    }

    static void star1() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 행의 갯수

        // 전체 행의 갯수 : N*2 -1
        // 열의 갯수 : N;

        for (int i = 0; i < N * 2 - 1; i++) {
            for (int j = 0; j < N; j++) {
                if (i < N) {
                    if (j >= N - 1 - i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    if (j >= i - N + 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
