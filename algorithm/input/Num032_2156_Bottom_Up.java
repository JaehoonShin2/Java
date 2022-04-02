package algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num032_2156_Bottom_Up {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 와인잔의 갯수

        int[] dp = new int[n + 1]; // 와인잔의 갯수 +1 만큼의 dp 배열 계산하기 쉽도록.
        int[] wine = new int[n + 1]; // 와인의 양을 담을 배열 마찬가지로 n+1로 생성해서 계산하기 쉽도록

        for (int i = 1; i < wine.length; i++) {
            wine[i] = Integer.parseInt(br.readLine());
        }

        dp[1] = wine[1];
        if (n > 1) {
            dp[2] = wine[1] + wine[2];
        }
        for (int i = 3; i <= n; i++) {

            dp[i] = Math.max(dp[i - 1],
                        Math.max(dp[i - 2] + wine[i], dp[i - 3] + wine[i - 1] + wine[i]));

        }
        System.out.println(dp[n]);

    }


}







//        dp[1] = wine[1];
//        dp[2] = dp[1] + wine[2];
//        dp[3] = Math.max(dp[1]+wine[3], wine[2]+wine[3]);
        // --> 오류 발생 구문.
//        for (int i = 4; i <= n; i++) {
//            dp[i] = Math.max(dp[i - 2] + wine[i],
//                    Math.max(dp[i - 3] + wine[i - 1] + wine[i], dp[i - 1]));
//        }
