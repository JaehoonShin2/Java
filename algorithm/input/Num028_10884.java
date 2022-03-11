package algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num028_10884 {
    static long[][] dp = new long[101][10];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long mod =  1000000000;

        for (int i = 1; i <= 9; i++) {
            dp[1][i] = 1;
        }

        for (int i = 2; i <= N; i++) {
            for (int k = 0; k <= 9; k++) {
                dp[i][k] = 0;
                if (k == 0) {
                    dp[i][k] =  ( dp[i-1][k+1] ) % mod;

                } else if (k == 9) {
                    dp[i][k] =  ( dp[i-1][k-1] ) % mod;

                } else {
                    dp[i][k] =  ( dp[i - 1][k - 1] + dp[i - 1][k + 1] ) % mod;
                }
            }
        }

        long result = 0;
        for (int i = 0; i < 10; i++) {
            result = ( result +  dp[N][i] ) % mod;
        }

        System.out.println(result);
    }


}
