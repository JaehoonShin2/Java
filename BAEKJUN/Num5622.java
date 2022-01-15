package com.github.BAEKJUN;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        char[] ch = str.toCharArray();
        int sum = 0;
        for (char c : ch) {
            // 알파벳이 ABC 중 하나라면 + 3초
            if (c >= 'A' && c <= 'C') {
                sum += 3;
                // 알파벳이 DEF 중 하나라면 + 4초
            } else if (c >= 'D' && c <= 'F') {
                sum += 4;
                // 알파벳이 GHI 중 하나라면 + 5초
            } else if (c >= 'G' && c <= 'I') {
                sum += 5;
                // 알파벳이 JKL 중 하나라면 + 6초
            } else if (c >= 'J' && c <= 'L') {
                sum += 6;
                // 알파벳이 MNO 중 하나라면 + 7초
            } else if (c >= 'M' && c <= 'O') {
                sum += 7;
                // 알파벳이 PQRS 중 하나라면 + 8초
            } else if (c >= 'P' && c <= 'S') {
                sum += 8;
                // 알파벳이 TUV 중 하나라면 + 9초
            } else if (c >= 'T' && c <= 'V') {
                sum += 9;
                // 알파벳이 WXYZ 중 하나라면 + 10초
            } else if (c >= 'W' && c <= 'Z') {
                sum += 10;
            }
        }
        System.out.println(sum);
    }
}