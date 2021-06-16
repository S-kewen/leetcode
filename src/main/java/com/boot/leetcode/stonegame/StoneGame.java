package com.boot.leetcode.stonegame;

/**
 * @PackageName: com.boot.leetcode.stonegame
 * @ClassName: StoneGame
 * @Description: This is StoneGame class by Skwen.
 * @Author: Skwen
 * @Date: 2021-06-16 22:18
 */
public class StoneGame {
    public static void main(String[] args) {
        System.out.println(stoneGame(new int[]{5, 3, 4, 5}));
    }

    public static boolean stoneGame(int[] piles) {
        int length = piles.length;
        int[] dp = new int[length];
        for (int i = 0; i < length; i++) {
            dp[i] = piles[i];
        }
        for (int i = length - 2; i >= 0; i--) {
            for (int j = i + 1; j < length; j++) {
                dp[j] = Math.max(piles[i] - dp[j], piles[j] - dp[j - 1]);
            }
        }
        return dp[length - 1] > 0;
    }
}
