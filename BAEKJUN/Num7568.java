package com.github.BAEKJUN;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num7568 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 전체 사람의 수
        int N = Integer.parseInt(br.readLine());

        int[][] arr = new int[N][2];
        StringTokenizer st;
        // arr[i][j] 라는 배열 안에 각 사람들의 키와 몸무게를 모두 담았다.
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < N; i++) {
            System.out.println(arr[i][0]);
            System.out.println(arr[i][1]);
        }


        for (int i = 0; i < N; i++) {
            int result = 1;
            for (int j = 0; j < N; j++) {

                if (i == j) continue; // 같은 사람의 순위를 매기는 것을 막을 예정

                if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
                    result++;
                }
            }
            System.out.printf("%d ", result);
        }
    }
}
