package com.boot.leetcode.uniquepaths;

/**
 * @PackageName: com.boot.leetcode.uniquepaths
 * @ClassName: UniquePaths
 * @Description: This is UniquePaths class by Skwen.
 * @Author: Skwen
 * @Date: 2021-05-08 20:16
 */
public class UniquePaths {
    public static void main(String[] args) {
        System.out.println(uniquePaths(3,7));
    }

    public static int uniquePaths(int m, int n) {
        long ans = 1;
        for (int x = n, y = 1; y < m; ++x, ++y) {
            ans = ans * x / y;
        }
        return (int) ans;
    }
}
