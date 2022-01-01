package com.github.BAEKJUN;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number1100 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int N = Integer.parseInt(s);
        int Init = N;
        int cnt = 0;

        while (true) {
            N = ((N % 10) * 10) + ( ( ( N / 10) + (N % 10) ) % 10);
            cnt++;

            if (Init == N) {
                break;
            }
        }
        System.out.println(cnt);
    }
}
