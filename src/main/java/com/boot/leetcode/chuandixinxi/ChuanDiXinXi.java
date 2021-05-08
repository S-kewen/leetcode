package com.boot.leetcode.chuandixinxi;

/**
 * @PackageName: com.boot.leetcode.chuandixinxi
 * @ClassName: ChuanDiXinXi
 * @Description: This is ChuanDiXinXi class by Skwen.
 * @Author: Skwen
 * @Date: 2021-05-09 3:17
 */
public class ChuanDiXinXi {
    public static void main(String[] args) {
        System.out.println(numWays(5,new int[][]{{0,2},{2,1},{3,4},{2,3},{1,4},{2,0},{0,4}},3));
    }

    public static int numWays(int n, int[][] relation, int k) {
        int[][] dp = new int[k + 1][n];
        dp[0][0] = 1;
        for (int i = 1; i < dp.length; i++) {
            for (int[] arr : relation) {
                dp[i][arr[1]] += dp[i - 1][arr[0]];
            }
        }
        return dp[k][n - 1];
    }
}
