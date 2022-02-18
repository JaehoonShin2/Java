package com.algorithm.lecture;

import java.util.Arrays;

public class Chap03_DesigningRecursion {
    public static void main(String[] args) {

        int[] data = new int[]{2, 99, 5, 77, 61, 89612, 56, 8719, 76};
        int end = data.length;

        Chap03_DesigningRecursion c = new Chap03_DesigningRecursion();
//        int result = c.search2(data, 0, end, 56) + 1;
        int result = BinarySearch(data, 0, end,76);
        System.out.println(result);

    }
    // 순환 함수의 가장 기초적인 것
    // 적어도 하나의 베이스케이스, 즉 종료될 if 상황이 만들어져야 한다.
    // 모든 케이스는 최종적으로 베이스케이스로 수렴해야 한다.

    // 암시적 매개변수를 명시적 매개변수로 바꾸기
    int search(int[] data, int n, int target) {
        for (int i = 0; i < n; i++) {
            if (data[i] == target) {
                return i;
            }
        }
        return -1;
        /*
            이 함수는 data[0] 부터 data[n-1] 까지의 배열 안에서 target 값이 있는지 없는지를
            탐색하는 순차탐색 함수이다. 여기서 "n" 이라는 값은 사용자가 매개변수로 직접 제시한
            명시적 매개변수이다.
            하지만 data[0] 의 0은? for int i = 0 의 "0" 은?
            여기서 0 이라는 값은 사용자가 매개변수로 제시한 값이 아니라, 암시적으로 담긴 매개변수이다.
            왜냐하면 data 배열의 인덱스 0부터 n-1 까지 배열의 모든 값을 탐색하는게 목적이기 때문이다.
        */
    }
        /*
            for문을 사용한 것이 아니라 재귀함수를 만들었다.
            이 함수는 위의 함수와 똑같은 기능을 한다.
            그리고 begin 은 위의 코드의 암시적 매개변수였던 0과 같은 역할을 한다.
        */
    int search(int[] data, int begin, int end, int target) {
        if (begin > end) {
            return -1;
        } else if (data[begin] == target) {
            return begin;
        } else {
            return search(data, begin + 1, end, target);
        }
    }

    // 순차 검생의 또다른 버전 (이진검색과는 다름)
    int search2(int[] data, int begin, int end, int target) {
        if (begin > end) {
            return -1;
        } else {
            int middle = (begin+end)/2;
            if (data[begin] == target) {
                return begin;
            }
            int index = search2(data, begin+1, middle, target);

            if (index != -1) {
                return index;
            } else {
                return search2(data, middle + 1, end, target);
            }
        }
    }

    //Binary search 를 재귀함수로 작성
    static int BinarySearch(int[] data, int begin, int end, int target) {
        // Binary Search의 핵심은 정렬!
        // 정렬이 이루어져 있지 않은 배열은 Binary Search 가 안된다.
        Arrays.sort(data);

        if (begin > end) {
            return -1;
        } else {
            int middle = (begin+end)/2;
            // compare은 비교해서 양수, 음수, 0 으로 나타낸다.
            int compResult = target - data[middle];
            if (compResult == 0) {
                return middle;
            } else if (compResult > 0) { // 타겟이 미들값보다 크다.
                return BinarySearch(data, middle+1, end, target);
            } else {
                return BinarySearch(data, begin, middle-1, target);
            }

        }

    }
}
