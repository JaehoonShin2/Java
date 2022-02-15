package com.algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Num018_2445 {

    public static void main(String[] args) throws IOException {

        star1();
    }

    static void star1() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 행의 갯수

        // 전체 행의 갯수 : N*2
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N * 2; j++) {
                if (i >= j) {
                    System.out.print("*");
                } else if (j > (N*2 - i -2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < N-1; i++) {
            for (int j = 0; j < N * 2; j++) {
                if (N - i - 1 > j) {
                    System.out.print("*");
                } else if ( j > N+i ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


    }
}
