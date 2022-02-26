package BAEKJUN;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NUm2294 {

    static int[] dp;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        dp = new int[k+1];
        int[] coin = new int[n];

        for (int i = 0; i < coin.length; i++) {
            coin[i] = Integer.parseInt(br.readLine());
        }

        // coin 배열에 동전의 종류까지 다 담은 상태.


        Arrays.fill(dp, 100001);
        dp[0] = 0;
        for (int i = 0; i < coin.length; i++) {

            for (int l = coin[i]; l <= k; l++) {
                dp[l] = Math.min(dp[l], dp[l - coin[i]] +1);
            }
        }
        System.out.println(dp[k] == 100001 ? -1 : dp[k]);
    }
}
