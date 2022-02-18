package com.algorithm.lecture;

public class Chap01_RecursionRun {
    public static void main(String[] args) {
        int k = 4;
        func(k);
        int m = 80;
        int n = 28;
        int result = gcd(m, n);
        System.out.println(result);
    }

    public static void func(int k) {
        if (k <= 0) { // Base case : 적어도 하나의 recursion에 빠지지 않는 경우가 존재해야 함.
            return;
        } else {
            System.out.println("hello...");
            func(k-1); // recursion을 반복하다보면 결국 base case에 수렴해야 한다.
        }
    }

    public static int gcd(int m, int n){
        if (n == 0) {
            return m;
        } else {
            return gcd(n, m%n);
        }
    }
}
