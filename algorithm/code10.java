package com.algorithm;

public class code10 {
    public static void main(String[] args) {

        // 1~100000 사이의 모든 소수들을 찾아서 출력하는 프로그램
        for (int i = 1; i <= 100000; i++) { // 정수 1~100000을 반복할 것이다.
            boolean isPrime = true; // 소수인지 아닌지를 판별할 플래그를 입력

            for (int n = 2; n * n <= i && isPrime; n++) { // 소수 라는 것은 2이상의 값으로 i가 나누어진다는 것.

                // i가 9이고, n=3일 때 3*3이 9라면 4라는 값은 볼 필요가 없다.
                // 또한 한 번이라도 n값으로 약수가 나왔다면 isPrime이 false 가 되었으면 for문을 돌릴 필요가 없다.
                if (i % n == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}

