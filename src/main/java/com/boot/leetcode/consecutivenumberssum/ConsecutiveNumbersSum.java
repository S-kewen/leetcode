package com.boot.leetcode.consecutivenumberssum;

/**
 * @PackageName: com.boot.leetcode.consecutivenumberssum
 * @ClassName: ConsecutiveNumbersSum
 * @Description: This is ConsecutiveNumbersSum class by Skwen.
 * @Author: Skwen
 * @Date: 2021-05-07 2:57
 */
public class ConsecutiveNumbersSum {
    public static void main(String[] args) {
        System.out.println(consecutiveNumbersSum(111));
    }

    public static int consecutiveNumbersSum(int N) {
        int ans = 0;
        for (int start = 1; start <= N; ++start) {
            int target = N, x = start;
            while (target > 0) {
                target -= x++;
            }
            if (target == 0) {
                ans++;
            }
        }
        return ans;
    }
}
