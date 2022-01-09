package com.github.BAEKJUN;

class Test {
    // 메소드
    long sum(int[] a){
        long sum = 0;

        for (int i = 0; i<a.length; i++){
            sum += a[i];
        }
        return sum;
    }
}

public class Num15596 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i<arr.length; i++){
            arr[i] = i;
        }
        Test ts = new Test();
        System.out.println(ts.sum(arr));
    }
}
