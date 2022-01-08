package com.github.BAEKJUN;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int C = Integer.parseInt(br.readLine());
        int sum = 0;
        double avg = 0;
        double count = 0;
        StringTokenizer st;
        int[] arr;

        for (int i = 0; i < C; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());
            arr = new int[N];

            for (int j = 0 ; j < N ; j++){
                int val = Integer.parseInt(st.nextToken());
                arr[j] = val;
                sum += val;
            }
            avg = (double) (sum / N) ;

            for (int j = 0; j < N; j++){
                if(arr[j]>avg){
                    count++;
                }
            }
            System.out.printf("%.3f%%\n", (count / N) * 100);
            count = 0;
            sum = 0;
            avg = 0;
        }
    }
}
