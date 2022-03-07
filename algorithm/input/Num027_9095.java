package algorithmTest;

import java.io.*;

public class Num027_9095 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());

        int[] dp = new int[12];

        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for (int j = 4; j <= 11; j++) {
            dp[j] = dp[j-1]+dp[j-2]+dp[j-3];
        }

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            bw.write(String.valueOf(dp[n]));
            bw.write("\n");
        }
        bw.close();
        System.out.println(bw.toString());

    }
}
