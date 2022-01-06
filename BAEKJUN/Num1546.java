package com.github.BAEKJUN;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        double []arr = new double[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        double M = 0; // max
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Double.parseDouble(st.nextToken());
            if (M < arr[i]) {
                M = arr[i];
            }
        }
        double avg = 0;
        for (int i =0 ; i < arr.length; i++) {
            arr[i] = arr[i]/M*100;
            avg += arr[i];
        }
        double avg2 = avg/N;
        System.out.println(avg2);
    }
}
