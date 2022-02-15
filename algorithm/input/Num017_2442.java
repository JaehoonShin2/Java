package com.algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Num017_2442 {

    public static void main(String[] args) throws IOException {

        star1();
    }

    static void star1() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 행의 갯수

        // 별 2 * N - 1;

        int leng = N;
        for (int i = 0; i < N; i++) { // 행의 반복

            for (int j = 0; j < leng; j++) {
                if ( N-i-1 > j) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }

            }
            leng++;
            System.out.println();
        }

    }
}
