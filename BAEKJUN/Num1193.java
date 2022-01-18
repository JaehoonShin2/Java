package com.github.BAEKJUN;

import javax.swing.text.Style;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        int num=0;
        int cnt=0;
        while (cnt < X){
            num++;
            cnt = num * (num+1) / 2;
        }
        if( num % 2 == 1 ){
            int f = 1 + (cnt - X);
            int l = num - (cnt - X);
            System.out.println(f + "/" + l);
        } else {
            int l = 1 + (cnt - X);
            int f = num - (cnt - X);
            System.out.println(f + "/" + l);
        }
    }
}
