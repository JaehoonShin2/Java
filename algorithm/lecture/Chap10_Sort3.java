package com.algorithm.lecture;

public class Chap10_Sort3 {

    /*
        퀵 정렬 역시 분할정복법을 사용한다.
        하지만 앞서 다루었던 emrge sort 와는 다르다.

        분할 : 배열을 pivot 를 기준으로 두
        pibot보다 작은 값, 큰 값의 두 부분으로 나눈다.!
        이렇게 피봇보다 작은 수와 큰 수로 재배치하는 것을
        "파티션을 나눈다" 라고 말한다.

        * 어느 부분을 pivot으로 설정하느냐! 가 핵심

        다만 정렬된 상태의 배열에서 pivot를 정하는 것이 아니기때문에
        운 나쁘게 설정한 pivot이 전체 배열 중에서 가장 큰 값이었을 수도,
        혹은 가장 작은 값이었을 수도 있다.


        정복 : 각 부분을 순환적으로 정렬한다.
        합병 : 아무것도 할 것이 없다.
        왜냐하면 pivot을 기준으로 앞부분을 정렬하고, 뒷부분을 정렬했다면
        그것으로 정렬은 끝난 상태이기 때문이다.

    */

}