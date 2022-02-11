package com.github.BAEKJUN;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num2231Atype {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int index = N;
        int result = 0; // 결과값

        while (index > 0) {
            index--; // N-1 부터 시작해서 생성자가 가능한 지 확인할 예정이다.
            int sum = index;
            int temp = index;

            while (temp != 0) {
                sum += temp % 10;
                temp /= 10;
            }

            if (sum == N) {
                result = sum;
            } // N이 0까지 하나씩 줄어들면서, 생성자 중에서 가장 작은 값이 result 에 저장된다.

        }
        System.out.println(result);
    }
}
