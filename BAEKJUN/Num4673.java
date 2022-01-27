package com.github.BAEKJUN;

public class Num4673 {
    public static void main(String[] args) {
//        int n = 1;
//        int il = n%10;
//        int sib = (n%100)/10;
//        int baek = (n%1000)/100;
//        int cheon = n/1000;
//        int[] arr = new int[10001];
//        boolean tf = false;
//
//        for(int i = 1; i<=10000; i++){
//            for(int j = 1; j<=10001; j++){
//                n = j; // 정수 1~10000의 집합
//                int N = n + il + sib + baek + cheon;
//                arr[j] = N; // 10000의 정수로 생성되는 모든 생성자 있는 숫자들을 담은 배열.
//            }
//            for(int j = 1; j<=10000; j++){
//                n = i;
//                if( n == arr[j]){
//                    tf = true;
//                    break;
//                }
//            }
//            if(tf == false){
//                System.out.println(n);
//            }
//        }
            int index = 10000; // 1~10000까지의 수
            boolean[] nums = new boolean[index]; // 셀프 넘버를 구분할 배열 선언

            for(int i=0; i<nums.length; i++) {
                if(d(i+1) < index+1)
                    nums[d(i+1)-1] = true; // 셀프 넘버가 아니면 true를 대입
            }
            for(int i=0; i<nums.length; i++) {
                if(nums[i] == false)
                    // nums[i]이 i+1에 해당하기 때문에 i+1 출력
                    System.out.println(i+1);
            }
        }

        static int d(int n) {

            int self = n;

            while(n > 0) { // n이 0이 될 때까지 반복
                self += (n % 10); // 일의 자리에 있는 수를 self에 누적
                n /= 10; // 자릿수가 하나씩 줄어듦
            }

            return self;

    }
}
