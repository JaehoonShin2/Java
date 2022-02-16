package com.algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num023_2747 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        if (45 >= N) {
            fibo(N);
        }
    }
    static void fibo(int n) {
        int[] fibonachi = new int[n+1];
            fibonachi[0] = 0;
            fibonachi[1] = 1;

        for (int i = 2; i <= n; i++) {
            fibonachi[i] = fibonachi[i-1] + fibonachi[i-2];
        }
        System.out.println(fibonachi[n]);
    }
}
