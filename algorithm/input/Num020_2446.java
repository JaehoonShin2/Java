package com.algorithmTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Num020_2446 {
    public static void main(String[] args) throws IOException {

//        star();
            star2();
    }

    static void star() throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int leng = N*2;
        int max = leng;
        for (int i = 0; i < N; i++) { // 전체 행은 N*2 -1
            max--;
            for (int j = 0; j < max; j++) {
                if (i > j) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < leng - N - 1; i++) { // 9 - 5 - 1 = 4
            max++;
            for (int j = 0; j < max; j++) {
                if ((leng - N - 1 - i) > (j + 1)) { // 4 - i = 3 > j
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    static void star2() throws IOException{
        //입력값
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i; j++) {
                bw.write(" ");
            }
            for (int j = i; j < N * 2 - 1 - i; j++) {
                bw.write("*");
            }
            bw.write("\n");
        }
        for (int i = 2; i <= N; i++) {
            for (int j = 0; j<N-i; j++) { //  i = 2 -> j=2, 1, 0 //
                bw.write(" ");
            }
            for (int j = N - i; j < N + i-1; j++) {
                bw.write("*");
            }
            bw.write("\n");
        }

        br.close();
        bw.close();



    }

}
