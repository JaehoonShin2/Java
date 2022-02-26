package BAEKJUN;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num9461_Solve3 {

    static long[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        long[] sol = new long[t];

        for (int k = 0; k < t; k++) {
            int n = Integer.parseInt(br.readLine());

            dp = new long[n+1];
            if (n < 6) {
                if (n < 4) {
                    sol[k] = 1;
                } else {
                    sol[k] = 2;
                }
            } else {
                dp[0] = 0;
                dp[1] = 1;
                dp[2] = 1;
                dp[3] = 1;
                dp[4] = 2;
                dp[5] = 2;
                for (int i = 6; i < dp.length; i++) {
                    dp[i] = dp[i-1] + dp[i-5];
                }
                sol[k] = dp[n];
            }
        }
        for (long arr : sol) {
            System.out.println(arr);
        }
    }
}
