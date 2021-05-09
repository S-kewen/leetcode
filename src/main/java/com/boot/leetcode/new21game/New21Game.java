package com.boot.leetcode.new21game;

/**
 * @PackageName: com.boot.leetcode.new21game
 * @ClassName: New21Game
 * @Description: This is New21Game class by Skwen.
 * @Author: Skwen
 * @Date: 2021-05-09 20:39
 */
public class New21Game {
    public static void main(String[] args) {
        System.out.println(new21Game(10, 1, 10));
    }

    public static double new21Game(int N, int K, int W) {
        if (K == 0) {
            return 1.0;
        }
        double[] dp = new double[K + W];
        for (int i = K; i <= N && i < K + W; i++) {
            dp[i] = 1.0;
        }
        for (int i = K - 1; i >= 0; i--) {
            for (int j = 1; j <= W; j++) {
                dp[i] += dp[i + j] / W;
            }
        }
        return dp[0];
    }
}
