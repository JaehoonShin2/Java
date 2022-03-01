package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num1629 {

    private static long[] dp;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        dp = new long[B];
        dp[0] = A % C;
        dp[1] = A * A %C;
        int k = 0;
        for (int l = 1; l < dp.length; l++) {
            if (k % 2 == 0) {
                dp[l] = dp[k / 2] * dp[k / 2] % C;
            } else {
                dp[l] = (dp[1] % C) * dp[(k - 1) / 2] * dp[(k - 1) / 2] % C;
            }
        }
        System.out.println(dp[B-1]);
    }

}
