package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num2630 {

    static int[][] data;
    private static int white = 0; // 0 의 갯수
    private static int Blue = 0; // 1 의 갯수


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
        CuttingLoop(0, 0, n);

        System.out.println(white);
        System.out.println(Blue);
    }

    private static void CuttingLoop(int n, int m, int size) {

        if (WBCheck(n, m, size)) {
            if (data[n][m] == 0) {
                white++;
            } else {
                Blue++;
            }
            return;
        } else {
            int nextsize = size / 2;

            //윗줄
            CuttingLoop(n, m, nextsize);
            CuttingLoop(n, m+nextsize, nextsize);
            //아랫줄
            CuttingLoop(n+nextsize, m, nextsize);
            CuttingLoop(n+nextsize, m+nextsize, nextsize);
        }
    }

    private static boolean WBCheck(int n, int m, int size) {
        int result = data[n][m];

        for (int i = n; i < n + size; i++) {
            for (int j = m; j < m + size; j++) {
                if (result != data[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
