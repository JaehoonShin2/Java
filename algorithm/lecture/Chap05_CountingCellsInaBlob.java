package com.algorithm.lecture;

public class Chap05_CountingCellsInaBlob {

    private static int N = 8;
    private static int[][] picel = {
            {1, 0, 0, 0, 0, 0, 0, 1},
            {0, 1, 1, 0, 0, 1, 0, 0},
            {1, 1, 0, 0, 1, 0, 1, 0},
            {0, 0, 0, 0, 0, 1, 0, 0},
            {0, 1, 0, 1, 0, 1, 0, 0},
            {0, 1, 0, 1, 0, 1, 0, 0},
            {1, 0, 0, 0, 1, 0, 0, 1},
            {0, 1, 1, 0, 0, 1, 1, 1}
    };

    private static final int BackGround_Color = 0;
    private static final int Image_Color = 1;
    private static final int Mark = 2; // 이미 카운팅이 된 숫자!
    private static int count = 0;

    public static int findBlobSize(int[][] picel, int x, int y) {
        if (x < 0 || y < 0 || x >= N || y >= N) {
            // x, y >= N 인 이유는, else 아래의 return이 if가 아니라 + 계산이기 떄문. 만약
            // findBlobSize(picel, 8, 8)이 된다해도, 값은 결국 0으로 반환. 결과에 지장을 안줌.
            // 그러나 x,y > N... 해버리면 함수가 에러뜸.
            return 0;
        } else if (picel[x][y] != Image_Color) {
            return 0;
        } else{
            picel[x][y] = Mark;
            return 1 + findBlobSize(picel, x - 1, y - 1) + findBlobSize(picel, x - 1, y) + findBlobSize(picel, x - 1, y + 1) +
                    findBlobSize(picel, x, y - 1)  + findBlobSize(picel, x, y + 1)  +
                    findBlobSize(picel, x + 1, y - 1) + findBlobSize(picel, x + 1, y) + findBlobSize(picel, x + 1, y + 1);
        }
    }

    public static void main(String[] args) {

        System.out.println(findBlobSize(picel,4,1 ));

    }
}

