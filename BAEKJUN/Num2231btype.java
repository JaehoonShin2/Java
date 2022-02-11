package com.github.BAEKJUN;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num2231btype {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // N 은 분해합이다.
        int N = Integer.parseInt(br.readLine());

        Num2231btype n2 = new Num2231btype();
        n2.calculator(N);


    }
    public void calculator(int N){

        // 분해합의 N-1의 역순으로 갈 것이다.
        int Number = N;
        // 최종적으로 출력하기 위한 값
        int reseult = 0;

        // while 로 반복구문으로 돌리자.
        while (Number > 0) {
            Number--;
            // hap은 number-1의 값 = 생성자
            int hap = Number;
            // temp는 자리수대로 끊어가기 위한 임의의 값
            int temp = Number;

            while (temp != 0) { // temp가 0이라는 것은 10으로 나누었을 때 더이상 자리수가 없다는 것
                hap += temp % 10;
                temp /= 10;
            }

            if (hap == N) {
                reseult = Number;
            }

        }
        System.out.println(reseult);
    }
}
