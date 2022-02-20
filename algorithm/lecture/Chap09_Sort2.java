package com.algorithm.lecture;

public class Chap09_Sort2 {

    /*
        merge sort / quick sort 는 분할 정복법을 사용한다.
        분할 정복법 (Divide and conquer)
        : 내가 세 가지 단계로 나누어 문제를 해결해나가는 방법.

        1) 분할 : 해결하고자 하는 문제를 작은 크기의 동일한 문제들로 분할.
        ex) 입력 N 개의 데이터 중에서 최대값을 구해야 한다면.
            N/2로 나눈 뒤 1~N/2 에서 최대값을 구하고, N/2 +1 ~ N 까지 중에서 최대값을 구한다.
            즉 "최대값을 찾아야한다" 라는 문제는 동일한데 비교해야 하는 사이즈, 크기가 작아졌다.

        2) 정복 : 각각의 작은 문제를 순환적으로 해결. 그런데 작은 문제라는 것은 결국 전체 문제와
            똑같은 해결방법이기 때문에 메인 문제와 작은 문제가 다른 해결방법을 택하는 것이 아니다.

        3) 합병 : 작은 문제의 해를 합하여 원래의 문제에 대한 해를 구함
        ex)  1~N/2 의 최대값과 N/2+1 ~ N 의 최대값을 해를 가지고, 둘을 비교해서 메인 문제인
            전체 N 개 데이터 중 최대값 찾는다.

            따라서 분할정복법은 recursion 을 사용하게 된다.

    */
    public static int[] data;
    public static int[] temp;
    public static void main(String[] args) {
        data = new int[] {5, 6, 9, 2, 77, 31, 95, 156, 1798, 1, 3, 52, 7};
        temp = new int[data.length];
        mergeSort(data, 0, data.length-1);
        printArray(data);

    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void mergeSort(int[] data, int p, int r) {
        // data 의 p부터 r 까지를 정렬한다.
        if (p < r) {
            int q = (p+r)/2; // int q 는 p~r까지의 인덱스의 중간값.
            mergeSort(data, p, q); // p ~ q, 즉 1~N/2 인 전반부의 정렬
            mergeSort(data, q + 1, r); // 후반부의 정렬
            merge(data, p, q, r);
        }
    }

    static void merge(int[] data, int p, int q, int r) {
        // 정렬이 완료된!
        // 배열 [p ~ q] 와 [q+1 ~ r] 의 두 배열을 해서 하나의 정렬된 배열로 만든다.
        int i = p, j = q+1, k = p;
        while (i <= q && j <= r) {
            if ( data[i] <= data[j]) { //
                // 앞부분 배열의 1번째값과 뒷부분 배열의 1번째값을 비교해서, 뒷부분이 크다면.
                temp[k++] = data[i++];
                //
            } else {
                temp[k++] = data[j++];
            }
        }
        // while이 끝났다는 것은, 전반부이든 후반부이든 어느 한 쪽의 배열이 모두 옮겨왔다는 것.
        while (i <= q) { // i가 q보다 작다는 것. 즉 전반부의 값이 남아있는 것
            temp[k++] = data[i++];
        }
        while (j <= r) { // j가 r보다 작다는 것. 즉 후반부의 값이 남아있는 것
            temp[k++] = data[j++];
        }
        for (int l = p; l <= r; l++) { // 복사된 배열 temp 를 원래의 배열인 data로 옮겨주는 작업
            data[l] = temp[l];
        }
        // 합병정렬의 단점은, 원본 배열을 새로운 배열에 복사하여 정렬한 뒤
        // 다시 원본 배열에 재복사해주어야 한다는 과정이 있는데 이 부분이 단점이다.

        /*
            시간복잡도
            T(N) = if n = 1, 0;
                  else T(N/2)(전반부배열) + T(N/2)(후반부배열) + n(복사배열을 원본배열로 옮기는 시간)

            => T(N) = 2T(N/2) + N;
            => 빅오(N log N );

        */
    }
}
