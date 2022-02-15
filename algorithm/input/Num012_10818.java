package com.algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Num012_10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        /*
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            arrayList.add(Integer.parseInt(st.nextToken()));
        }


        Collections.sort(arrayList);
        int min = arrayList.get(0);
        int max = arrayList.get(arrayList.size()-1);
        System.out.println(min + " " + max);
        */

        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        maxMin(N, arr);
        minMax(N, arr);
    }

    static void maxMin(int N, int[] arr) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int temp : arr) {
            arrayList.add(temp);
        }
        Collections.sort(arrayList);
        int min = arrayList.get(0);
        int max = arrayList.get(arrayList.size()-1);
        System.out.println(min + " " + max);
    }

    static void minMax(int N, int[] arr) {
        int min = 1000000;
        int max = -1000000;

        for (int i = 0; i < N; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(min + " " + max);
    }
}
