package com.algorithm.lecture;

import java.util.Arrays;

public class Chap07_powerSet {

    /*
        멱집합 : 임의의 집합 데이터의 모든 부분 집합을 출력하라...
        2^n 이다.

        {a, b, c, d, e, f } 의 모든 부분집합을 나열하려면
            - a 를 제외한 {b, c, d, e, f)의 모든 부분집합들을 나열하고
            - {b, c, d, e, f } 의 모든 부분 집합에 {a} 를 추가한 집합들을 나열한다.

            ==> {a}가 없는 케이스{b, c, d, e, f} 의 부분집합 합
            ==> {a}가 있는 케이스 {b, c, d, e, f} 의 부분집합 합

    */
//    public static void main(String[] args) {
//        String[] str = new String[] {"a", "b", "c", "d", "e", "f" };
//
//    }
//
////    static int powerset(String[] str) {/
////        int sum = 0; // 부분집합의 합계
////        int cnt = str.length; // 배열의 총 갯수
////
////        if (cnt == 0) {
////            return 0;
////        }
////        for (int i = 0; i < cnt; i++) {
////            str.
////        }
////    }
}
