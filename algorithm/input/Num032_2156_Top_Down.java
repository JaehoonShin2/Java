package algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Num032_2156_Top_Down {
    static int[] dp;
    static int[] wine;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        dp = new int[n+1];
        wine = new int[n+1];

        for (int i = 1; i < wine.length; i++) {
            wine[i] = Integer.parseInt(br.readLine());
        }

        Arrays.fill(dp, -1); // dp의 값이 아직 안채워져있음을 recur 돌 때 if 구문으로 확인하기 위함.
        dp[0] = 0;
        dp[1] = wine[1];
        if (n > 1) {
            dp[2] = wine[1]+wine[2]; // dp[2] 는 확정적으로 wine[1]+wine[2]의 값이다.
        }

        System.out.println(recur(n));
    }

    private static int recur(int n){

        if (dp[n] == -1) {
            dp[n] = Math.max(
                    recur(n-1), Math.max(recur(n-2)+wine[n], recur(n-3)+wine[n-1]+wine[n]));
        }
        return dp[n];
    }
}
