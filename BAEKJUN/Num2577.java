package com.github.BAEKJUN;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num2577 {
        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int[] arr = new int[10];
            int value = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
            String str = String.valueOf(value);
            for (int i = 0; i < str.length(); i++) {
                arr[(str.charAt(i) - 48)]++; // -48은 charAt()의 경우 아스키코드를 피하기 위함
            }
            for (int v : arr) {
                System.out.println(v);
            }

        }
}
