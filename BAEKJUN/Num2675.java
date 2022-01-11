package com.github.BAEKJUN;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int textCase = Integer.parseInt(br.readLine()); // 테스트케이스
        String[] arr = new String[textCase];
        int val = 0;
        for (int i = 0; i < textCase; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            String row = st.nextToken();
            val = Integer.parseInt(row);
            arr[i] = st.nextToken();
            String s = arr[i];

            for(int j = 0; j<s.length(); j++ ){
                for (int k = 0; k < val; k++) {
                    System.out.print(s.charAt(j));
                }
            }
        }
    }
}
