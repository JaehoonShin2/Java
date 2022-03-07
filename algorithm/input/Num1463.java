package algorithmTest;

import java.util.Scanner;

public class Num1463 {
    static int[] dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dp = new int[n+1];

        // 1. bottom-up
        dp[0] = 0;
        dp[1] = 0;
        for (int i = 2; i <= n; i++) {
            dp[i] = i-1;
            if (n % 2 == 0) {
                dp[i] = Math.min(dp[i/2], dp[i]) + 1;
            }
            if (n % 3 == 0) {
                dp[i] = Math.min(dp[i/3], dp[i]) + 1;
            }
        }

        System.out.println(dp[n]);
    }

    // 2. up-down
    private static int recur(int n, int count){
        if (n < 2) {
            return count;
        }

        return
                Math.min(
                recur(n/2, count + 1 + (n%2)),
                recur(n/3, count + 1 + (n%3))
                )
        ;

    }
}
