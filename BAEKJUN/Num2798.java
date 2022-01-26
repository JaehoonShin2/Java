package com.github.BAEKJUN;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        // 카드의 갯수
        int M = Integer.parseInt(st.nextToken());
        // 합
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(search(arr, N, M));

    }
    static int search(int[] arr, int n, int m) {
        int result = 0;
        // 3중 for문
        for (int i = 0; i < n - 2; i++) {

            for (int j = i + 1; j < n - 1; j++) {

                for (int k = i + 2; k < n; k++) {

                    int sum = arr[i] + arr[j] + arr[k];

                    if (sum == m) {
                        return sum;
                    }
                    if (result < sum && sum < m) {
                        result = sum;
                    }

                }
            }
        }
        return result;
    }
}
