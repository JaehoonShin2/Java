package algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num029_11057 {
    private static int[][] dp = new int[1001][10];
    private static int mod = 10007;
    private static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        N = n;

        for (int i = 0; i < 10; i++) {
            dp[1][i] = 1;
        }

        for (int i = 2; i <= n; i++) {
            for (int k = 0; k < 10; k++) {
                for (int l = k; l < 10; l++) {
                    dp[i][k] += dp[i-1][l];
                    dp[i][k] %= mod;
                }
            }
        }

        int result = 0;
        for (int i = 0; i < 10; i++) {
            result = (result + dp[n][i]) % mod;
        }
        System.out.println(result);

        solution();

    }

    static void solution() {
        long sum = 0;
        int[] dp = topdown(N);
        for (int num : dp) {
            sum += num;
            sum %= mod;
        }
        System.out.println(sum);
    }

    static int[] topdown(int dep) {
        int[] dp2 = new int[10];
        if  (dep == 1) {
            for (int i = 0; i < 10; i++) {
                dp2[i] = 1;
            }
            return dp2;
        }

        int[] before = topdown( dep - 1);
        dp2[0] = 1;
        for (int i = 1; i < 10; i++) {
            dp2[i] = (dp2[i - 1] + before[i]) % 10_007;
        }

        return dp2;
    }
}
