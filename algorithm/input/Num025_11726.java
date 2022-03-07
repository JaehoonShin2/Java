package algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num025_11726 {

    static int[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dp = new int[n+1];

        dp[0] = 1;
        dp[1] = 1;
        if (n >= 2) {
            for (int i = 2; i <= n; i++){
                dp[i] = (dp[i-1] + dp[i-2]) % 10007;
            }
        }
        System.out.println(dp[n]);


    }
}
