package com.boot.leetcode.climbingstairs;

/**
 * @PackageName: com.boot.leetcode.climbingstairs
 * @ClassName: ClimbingStairs
 * @Description: This is ClimbingStairs class by Skwen.
 * @Author: Skwen
 * @Date: 2021-05-22 3:31
 */
public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(2));
    }

    public static int climbStairs(int n) {
        int p = 0, q = 0, r = 1;
        for (int i = 1; i <= n; ++i) {
            p = q;
            q = r;
            r = p + q;
        }
        return r;
    }
}
