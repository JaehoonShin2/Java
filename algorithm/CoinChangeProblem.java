package algorithm;

import java.util.Scanner;

public class CoinChangeProblem {

    static int[] coin; // 동전의 종류가 들어갈 배열.
    static int[] dp; // 동적계획법에 의거해 필요한 동전의 최소갯수가 들어갈 배열

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 물건의 가격
        int k = sc.nextInt(); // 동전을 합하여 만들고자 하는 금액

        coin = new int[n]; // 입력받은 동전 종류, 1원, 5원, 11원이 각각의 배열 인덱스에 담김
        dp = new int[k+1]; // 출력의 용이성을 위해 배열의 0번 인덱스가 아닌 1번 인덱스부터 값을 담을 것이기 때문

        for (int i = 1; i <= k; i++) {
            dp[i] = -1; // 초기화를 해주기 위함

            for (int l = 0; l < n; l++) {

                if (coin[l] <= i) { // coin[0] 은 1원. 만약 1이 i값보다 작다면 행의 진행
                                // 반면 coin[1] 이 5원인데 i가 3이리면 다움 i가 반복됨

                    if ( dp[  i - coin[l]  ] < 0) {
                        // dp [ i - coin[l] 의 값이 -1이라면, 즉 주어진 코인이
                        // 2, 5, 11원일 경우 주어진 n이 8이라면, 경우의 수는 나오지 않는다.

                        if (dp[i] < 0) {
                            dp[i] = dp[i - coin[l] ] + 1;
                        }

                        else if (dp[i - coin[l]] + 1 < dp[i]) {
                            dp[i] = dp[i - coin[l]] + 1;
                        }
                    }

                }
            }
        }


    }

}
