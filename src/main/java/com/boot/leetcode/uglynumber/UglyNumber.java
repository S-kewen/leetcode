package com.boot.leetcode.uglynumber;

/**
 * @PackageName: com.boot.leetcode.uglynumber
 * @ClassName: UglyNumber
 * @Description: This is UglyNumber class by Skwen.
 * @Author: Skwen
 * @Date: 2021-05-24 3:26
 */
public class UglyNumber {
    public static void main(String[] args) {
        System.out.println(isUgly(6));
    }

    public static boolean isUgly(int n) {
        if (n <= 0) {
            return false;
        }
        int[] factors = {2, 3, 5};
        for (int factor : factors) {
            while (n % factor == 0) {
                n /= factor;
            }
        }
        return n == 1;
    }
}
