package com.algorithmTest;

import java.io.*;

public class Num022_10992 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int row = N;

        for (int i = 1; i <= N; i++) {

            if (i == N) {
                for (int j = 0; j < N * 2 - 1; j++) {
                    bw.write("*");
                }
                break;
            }
            for (int j = 1; j <= row; j++) {
                if (j == N-i+1 || j == row) {
                    bw.write("*");
                } else {
                    bw.write(" ");
                }
            }
        row++;
        bw.write("\n");
        }
        bw.close();
        br.close();
    }
}
