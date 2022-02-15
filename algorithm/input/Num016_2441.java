package com.algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Num016_2441 {

    public static void main(String[] args) throws IOException {

        star1();
    }

    static void star1() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 행의 갯수

        for (int i = 0; i < N; i++) { // 반복문은 N값 만큼
            for (int j = 0; j < N; j++) {
                if (i  > j) {
                    System.out.print(" ");
                } else
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
