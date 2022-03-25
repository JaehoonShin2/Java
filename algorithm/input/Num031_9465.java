package algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num031_9465 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        while(t>0){
            int n = Integer.parseInt(br.readLine());
            int[][] arr = new int[2][n+1];
            for(int i = 0; i < 2; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                for (int j = 1; j <= n; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int[][] dp = new int[2][n+1];

            dp[0][1] = arr[0][1];
            dp[1][1] = arr[1][1];

            for (int k = 2; k <= n; k++) {
                dp[0][k] = Math.max(dp[1][k-1], dp[1][k-2]) + arr[0][k];
                dp[1][k] = Math.max(dp[0][k-1], dp[0][k-2]) + arr[1][k];
            }

            int result = Math.max(dp[0][n], dp[1][n]);

            sb.append(result);
            sb.append("\n");

            t--;

        }

        System.out.println(sb.toString());
    }
}
