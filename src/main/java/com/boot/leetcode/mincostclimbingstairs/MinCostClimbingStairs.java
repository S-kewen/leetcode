package com.boot.leetcode.mincostclimbingstairs;

/**
 * @PackageName: com.boot.leetcode.mincostclimbingstairs
 * @ClassName: MinCostClimbingStairs
 * @Description: This is MinCostClimbingStairs class by Skwen.
 * @Author: Skwen
 * @Date: 2021-05-27 3:26
 */
public class MinCostClimbingStairs {
    public static void main(String[] args) {
        System.out.println(minCostClimbingStairs(new int[]{10, 15, 20}));
    }

    public static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n + 1];
        dp[0] = dp[1] = 0;
        for (int i = 2; i <= n; i++) {
            dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);
        }
        return dp[n];
    }
}
