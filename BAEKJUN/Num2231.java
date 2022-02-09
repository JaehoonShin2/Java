package com.github.BAEKJUN;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Num2231 {
        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int N = Integer.parseInt(br.readLine());

            int result = 0;

            for(int i = 0; i < N; i++) {
                int number = i; // 0부터 N-1까지 순서대로 증가할 변수
                int sum = 0;	// 자리수의 총합

                while(number != 0) {
                    sum += number % 10;	// 각 자릿수 더하기
                    number /= 10; // 10으로 나누어가면서 최종적으로 자리수를 찾아가는 과정
                }

                if(sum + i == N) { // sum(자리수합) + i(변수)
                    result = i;
                    break; // 가장 작은 수를 찾는 것이기 때문에 순서대로 올라가다가 발견하면 stop.
                }
            }
            System.out.println(result);
        }
}


