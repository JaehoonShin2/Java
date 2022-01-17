package com.github.BAEKJUN;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int num = 1;
        for(int i = 0; i<1000000; i++){
            num += i * 6;
            if( N <= num ){
                System.out.println(i+1);
                break;
            }
        }
    }
}
