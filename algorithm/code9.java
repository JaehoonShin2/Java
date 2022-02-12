package com.algorithm;

import java.util.Scanner;

public class code9 {
    public static void main(String[] args) {

        // n개의 정수를 입력받아 순서대로 배열에 저장한다.
        // 그럼다음 모든 정수들을 한 칸씩 오른쪽으로 shift 시켜라
        // 마지막 정수는 배열의 첫번째 칸으로 이동하라.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        int tem = arr[n-1]; // 인덱스 상으로는 n-1의 값이 제일 마지막의 값이다.
        for (int i = n - 2; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }
        arr[0] = tem;

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }
}
