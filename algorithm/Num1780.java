package boj;

import jdk.nashorn.internal.ir.WhileNode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num1780 {

    static int[][] data;
    static int graycount = 0; // -1 의 갯수
    static int blackcount = 0; // 0 의 갯수
    static int whitecount = 0; // 1 의 갯수


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        data = new int[n][n];

        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < n; j++) {
                data[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        // 값을 다 담았음.

        CutingLoop(0, 0, n);

        System.out.println(graycount);
        System.out.println(blackcount);
        System.out.println(whitecount);

    }

    private static void CutingLoop(int n, int m, int size) {

        if (ColorCheck(n, m, size)) {
            if (data[n][m] == -1) {
                graycount++;
            } else if (data[n][m] == 0) {
                blackcount++;
            } else {
                whitecount++;
            }
            // 정료
            return;
        } else {
            // 같지 않다면, 9조각으로 즉 3x3 으로 쪼갤 예정.
            int nextsize = size/3;

            //첫째줄
            CutingLoop(n, m, nextsize);
            CutingLoop(n, m + nextsize, nextsize);
            CutingLoop(n, m + (2 * nextsize), nextsize);

            //둘째줄
            CutingLoop(n + nextsize, m, nextsize);
            CutingLoop(n + nextsize, m + nextsize, nextsize);
            CutingLoop(n + nextsize, m + (2 * nextsize), nextsize);

            //셋째줄
            CutingLoop(n + (2 * nextsize), m, nextsize);
            CutingLoop(n + (2 * nextsize), m + nextsize, nextsize);
            CutingLoop(n + (2 * nextsize), m + (2 * nextsize), nextsize);

        }

    }

    private static boolean ColorCheck(int n, int m, int size){
        // n은 행의 첫번째값 m은 열의 첫번째값 size 는 배열의 크기.
        int result = data[n][m];
        // result 는 ColorCheck 를 할 배열의 (0,0) 의 값

        for (int i = n; i < n + size; i++) {
            for (int j = m; j < m + size; j++) {
                if (data[i][j] != result) {
                    return false;
                    // 만약 (0,0) 값과 각 배열의 값 중 하나라도 다르라면 false;
                }
            }
        }
        return true;
    };

}
