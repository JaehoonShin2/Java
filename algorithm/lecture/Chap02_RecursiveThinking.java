package com.algorithm.lecture;

public class Chap02_RecursiveThinking {
    public static void main(String[] args) {
        String str = "나의이름은?";

        System.out.println(length(str));

        StringPrint(str);
        System.out.println();
        StringReversed(str);
        System.out.println();
        PrintBinary(9);

        System.out.println();
        int[] arr = new int[] {1, 5, 33, 7, 6, 99};
        int nn = arr.length;
        System.out.println(Sum(nn, arr));
    }
    // 문자열의 갯수를 카운트해서 출력하는 재귀 메소드
    static int length(String str) {
        if (str.equals("")) {
            return 0;
        } else {
            return 1 + length(str.substring(1));
        }
    }
    // 문자열을 프린트하는 재귀 메소드
    static void StringPrint(String str) {
        if (str.length() == 0) {
            return;
        } else {
            System.out.print(str.charAt(0));
            StringPrint(str.substring(1));
        }
    }

    // 문자열을 거꾸로 뒤집어서 출력하는 재귀 메소드
    static void StringReversed(String str) {
        if (str.length() == 0) {
            return;
        } else {
            StringReversed(str.substring(1));
            System.out.print(str.charAt(0));
        }
    }

    // 2진수로 바꾸는 재귀 메소드
    static void PrintBinary(int n) {
        if (n < 2) {
            System.out.print(n);
        } else {
            PrintBinary(n / 2);
            System.out.print(n%2);
        }
    }

    // 배열의 합 구하기
    static int Sum(int n, int[] arr) {
        if (n == 0) {
            return 0;
        } else {
            return Sum(n-1, arr) + arr[n-1];
        }
    }
}
