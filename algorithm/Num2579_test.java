package BAEKJUN;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Num2579_test {

        static int[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

         dp = new int[n+1];
         int[] score = new int[n];

        for (int i = 0; i < score.length; i++) {
            int k = Integer.parseInt(br.readLine());
            score[i] = k;
        }

        Arrays.fill(dp, -111);

        if(0 < n && n < 3) {
            if(n == 1 ) {
                dp[1] = score[0];
                System.out.println(dp[1]);
            }
            if( n == 2 ) {
                dp[1] = score[0];
                dp[2] = dp[1] + score[1];
                System.out.println(dp[2]);
            }
        } else {
            dp[0] = 0;
            dp[1] = score[0];
            dp[2] = dp[1] + score[1];
            for (int i = 3; i < n + 1; i++) {
                dp[i] = Math.max(dp[i - 2], dp[i - 3] + score[i - 2]) + score[i - 1];
                // dp[3] = dp[2] 과 dp[1] + score[3-2] 중 큰 값
                //          30
            }
            System.out.println(dp[n]);
        }
    }
}
