package com.algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num013_2438 {

    public static void main(String[] args) throws IOException {

        Num013_2438 n2438 = new Num013_2438();
        n2438.star1();
    }

    void star1() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String star = "*";
        for (int i = 0; i < N; i++) {
            System.out.println(star);
            star += "*";
        }
    }
}
