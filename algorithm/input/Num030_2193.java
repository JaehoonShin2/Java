package algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num030_2193 {
    private static long dp[] = new long[91];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        dp[1] = 1;
        dp[2] = 1;
        for (int i = 3; i < dp.length; i++) {
                dp[i] = dp[i-1] + dp[i-2];
        }

        System.out.println(dp[n]);

    }

    private static long recur(int i) {
        if (i == 2) {
            return 1;
        } else {
            return  2 * recur(i-1);
        }
    }

}
