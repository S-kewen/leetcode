package com.boot.leetcode.strangeprinter;

/**
 * @PackageName: com.boot.leetcode.strangeprinter
 * @ClassName: StrangePrinter
 * @Description: This is StrangePrinter class by Skwen.
 * @Author: Skwen
 * @Date: 2021-05-02 2:51
 */
public class StrangePrinter {
    public static void main(String[] args) {
        System.out.println(strangePrinter("aaabbbCcb"));
    }

    public static int strangePrinter(String s) {
        int n = s.length();
        if (n == 0) {
            return 0;
        }
        char[] chars = s.toCharArray();
        // dp[l][r] 表示打印区间[l, r]的最小操作次数
        int[][] dp = new int[n + 1][n + 1];

        for (int i = 0; i < n; i++) {
            dp[i][i] = 1;
        }
        for (int len = 2; len <= n; len++) {
            for (int l = 0, r = l + len - 1; r < n; l++, r = l + len - 1) {
                dp[l][r] = 1 + dp[l + 1][r];
                for (int k = l + 1; k <= r; k++) {
                    if (chars[l] == chars[k]) {
                        dp[l][r] = Math.min(dp[l][r], dp[l][k - 1] + dp[k + 1][r]);
                    }
                }
            }
        }
        return dp[0][n - 1];
    }
}
