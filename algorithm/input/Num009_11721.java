package com.algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num009_11721 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        Print10(str);
    }
    static void Print10(String s){

        int num = s.length() / 10; // 10자리로 끊어지는 갯수수
       char ch;
        int i = 0; // '문자'의 갯수
        while (num >= 0) {
            ch = s.charAt(i);
            System.out.print(ch);
            i++;
            if (i%10 == 0) {
                num--;
                System.out.println();
            }
            if ( i >= s.length() ) {
                break;
            }
        }
    }
}
