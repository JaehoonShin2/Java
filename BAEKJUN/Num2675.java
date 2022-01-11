package com.github.BAEKJUN;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine()); // 테스트케이스
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int n = Integer.parseInt(st.nextToken());
            char[] val = st.nextToken().toCharArray();
            int length = val.length;
            for(int j = 0; j<length; j++ ){
                for (int k = 0; k < n; k++) {
                    System.out.print(val[j]);
                }
            }
            System.out.println();
        }
    }
}
