package com.algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num006_11718 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        String str;

        while ( true ) {
            str = br.readLine();
            if (str == null || str.isEmpty()) break;
            // String 객체는 null 값 혹은 isEmpty 로 표현한다.
            // 반면 원시자료형은
            sb.append(str).append("\n");
        }
        System.out.println(sb);
    }
}
