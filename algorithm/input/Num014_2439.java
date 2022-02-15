package com.algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num014_2439 {

    public static void main(String[] args) throws IOException {

        Num014_2439 n2438 = new Num014_2439();
        n2438.star1();
    }

    void star1() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String star = "*";
        int num = N-1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if ((num - i) <= j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
