package BAEKJUN;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num9461 {

    static int[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[] sol = new int[t];

            for (int k = 0; k < t; k++) {
                int n = Integer.parseInt(br.readLine());

                dp = new int[n+1];
                if (n < 6) {
                    switch (n) {
                        case 0:
                            sol[k] = 0;
                            break;
                        case 1:
                            sol[k] = 1;
                            break;
                        case 2:
                            sol[k] = 1;
                            break;
                        case 3:
                            sol[k] = 1;
                            break;
                        case 4:
                            sol[k] = 2;
                            break;
                        case 5:
                            sol[k] = 2;
                            break;
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
        for (int j = 0; j < sol.length; j++) {
            System.out.println(sol[j]);
        }
    }
}
