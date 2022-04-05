package algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num033_11053_bottom_Up {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] dp = new int[n];
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }


        int lis = 1;
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
            for (int k = 0; k < i; k++) {
                if (arr[i] > arr[k] && dp[k] >= dp[i]) {
                    dp[i] = dp[k] + 1;
                }
            }
            lis = Math.max(lis, dp[i]);
        }

        System.out.println(lis);
    }
}
