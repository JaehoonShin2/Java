package com.algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num008_11720 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String s = br.readLine();

        sum(N, s);

    }

    static void sum(int N, String s){

        char[] ch = new char[N];
        int sum = 0;

        for (int i = 0; i < N; i++) {
            ch[i] = s.charAt(i);
            sum += ch[i]-48;
        }

        System.out.println(sum);


    }

}

