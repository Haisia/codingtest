package org.haisia.p11051;

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int K = sc.nextInt();

    int[][] dp = new int[N + 1][K + 1];

    for (int n = 0; n <= N; n++) {

      for (int k = 0; k <= Math.min(n, K); k++) {
        if (k == 0 || k == n) {
          dp[n][k] = 1;
        } else {
          dp[n][k] = (dp[n - 1][k - 1] + dp[n - 1][k]) % 10007;
        }
      }
    }

    System.out.println(dp[N][K]);
  }
}