package com.algorithmTest;

import java.io.*;

public class Num021_10991 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

//        for (int i = 1; i <= N; i++) {
//            for (int j = 0; j < N - i; j++) {
//                bw.write(" ");
//            } // 첫번쨰 * 전의 공백값을 모두 입력했음
//            for (int j = 1; j <= i * 2 - 1; j++) {
//                if (j % 2 == 1) {
//                    bw.write("*");
//                } else {
//                    bw.write(" ");
//                }
//            }
//        bw.write("\n");
//        }

        int cnt = 0;

        while (N > 0) {
            N--; // 5,4,3,2,1 총 5번의 행이 실행될 예정
            for (int i = 0; i < N; i++) {
                bw.write(" "); // N의 갯수-1 만큼 공백을 입력
            }
            cnt++;
            for (int i = 0; i < cnt; i++) {
                bw.write("* "); // 공백이 모두 입력된 뒤, "* " 가 입력되는 형식. 행이 돌아갈수록,
                                    // cnt가 1씩 증가하면서 "* * " ... "* * * "... 출력됨
            }
            bw.write("\n");
        }
        bw.close();
        br.close();
    }
}
