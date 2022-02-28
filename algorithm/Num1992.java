package boj;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num1992 {

    private static int[][] data;
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        data = new int[n][n];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < n; j++) {
                data[i][j] = str.charAt(j) - 48;
            }
        }
        // 값을 다 담았음.

        Quadtree(0, 0, n);
        System.out.println(sb);


    }

    private static void Quadtree(int n, int m, int size) {

        if (WBCheck(n, m, size)) {
            sb.append(data[n][m]);
            return;
        }
        else {

            int nextsize = size / 2;

            sb.append("(");
            //윗줄
            Quadtree(n, m, nextsize);
            Quadtree(n, m+nextsize, nextsize);
            //아랫줄
            Quadtree(n+nextsize, m, nextsize);
            Quadtree(n+nextsize, m+nextsize, nextsize);

            sb.append(")");
        }

    }

    private static boolean WBCheck(int n, int m, int size) {
        int result = data[n][m];
        // 최초 행의 값

        for (int i = n; i < n+size; i++) {
            for (int j = m; j < m+size; j++) {
                if (result != data[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
