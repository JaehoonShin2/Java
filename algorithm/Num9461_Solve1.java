package BAEKJUN;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num9461_Solve1 {

    static long[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        long[] sol = new long[t];

            for (int k = 0; k < t; k++) {
                int n = Integer.parseInt(br.readLine());

                dp = new long[n+1];
                if (0 < n && n < 3) {
                    sol[k] = 1;
                }
                else {
                    dp[0] = 0;
                    dp[1] = 1;
                    dp[2] = 1;
                    for (int i = 3; i < dp.length; i++) {
                        dp[i] = dp[i-2] + dp[i-3];
                    }
                    sol[k] = dp[n];
                }
            }
        for (long arr : sol) {
            System.out.println(arr);
        }
    }
}
