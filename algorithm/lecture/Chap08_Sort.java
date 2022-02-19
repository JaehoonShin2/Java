package com.algorithm.lecture;

public class Chap08_Sort {

    /*
        정렬 알고리즘
        // 쉽지만, 단순해서 효율적이지는 않은 정렬
        - 버블 bubble sort
        - 선택 selection sort
        - 삽입 insert sort

        // 발전된 정렬
        - 퀵 quick sort
        - 합병 merge sort
        - 힙 heap sort

        - Radix sort
    */

    public static void main(String[] args) {
        int[] arr = new int[] {5, 3, 9, 7, 2, 66, 1, 8};
        bubble(arr);
        System.out.println();
        SelectSort(arr);
        System.out.println();
        InsertSort(arr);
    }

    public static void bubble(int[] arr) {
        // bubble sort 의 일반적인 방식은
        // arr[N] 에 가장 큰 값을 저장 후, arr[n-1] 의 배열에서 다시 버블정렬을 시작,
        // arr[N-1] 에 값에 두번째로 큰 값을 저장하고, arr[N-2] .... arr[0] 이 될 때까지 반복하는 구조
        int cnt = arr.length-1; // 8

        for (int i = 0; i < cnt; i++) {
            for (int j = 0; j < cnt-i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i <= cnt; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void SelectSort(int[] arr) {
        int cnt = arr.length;

        for (int i = 1; i < cnt; i++) {
            int min = arr[i-1];
            for (int j = i; j < cnt; j++) {
                // j가 i가 되어야 하는 이유는 이중for문의 시작값은 n-1, n-2, n-3 ... 1로 줄어들어야 하기 떄문.
                if (min > arr[j]) {
                    min = arr[j];
                }
            }
            arr[i-1] = min;
        }
        for (int i = 0; i < cnt; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void InsertSort(int[] arr) {
        int cnt = arr.length; // 배열의 인덱스값 + 1
        for (int i = 1; i < cnt; i++) {
            int temp = arr[i];
            int k;
            for (k = i - 1;  k >= 0 && arr[k] > temp; k--) {
                arr[k+1] = arr[k];
            }
            arr[k+1] = temp;
        }
        for (int i = 0; i < cnt; i++) {
            System.out.print(arr[i]+" ");

        }
    }



}
