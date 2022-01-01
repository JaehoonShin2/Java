package com.github.BAEKJUN;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num10818{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        Integer.parseInt(br.readLine()); // 첫행의 N, 즉 정수의 갯수 행을 무시.
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int max = -1000001;
        int min = 1000001;

        while (st.hasMoreTokens()){
            int value = Integer.parseInt(st.nextToken());
            if(max<value){
                max = value;
            }
            if(min>value){
                min = value;
            }
        }
        System.out.println(min + " " + max);
    }
}
