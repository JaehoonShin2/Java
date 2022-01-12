package com.github.BAEKJUN;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Num1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[26];
        String s = br.readLine().toUpperCase(Locale.ROOT);

        int max = -1;
        char ch = '?';

        for(int i = 0; i < s.length(); i++){
            int a = s.charAt(i)-65;
            arr[a]++;
            if(max < arr[a]) {
                    max = arr[a];
                    ch = s.charAt(i);
            } else if( max == arr[a]){
                ch = '?';
            }
        }
        System.out.println(ch);
    }
}
