package com.algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Recursion01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        System.out.println(sum(N));

    }

    static int sum(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + sum(n-1);
        }
    }
}
