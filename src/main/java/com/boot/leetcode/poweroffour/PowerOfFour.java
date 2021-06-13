package com.boot.leetcode.poweroffour;

/**
 * @PackageName: com.boot.leetcode.poweroffour
 * @ClassName: PowerOfFour
 * @Description: This is PowerOfFour class by Skwen.
 * @Author: Skwen
 * @Date: 2021-06-14 2:53
 */
public class PowerOfFour {
    public static void main(String[] args) {
        System.out.println(isPowerOfFour(16));
    }

    public static boolean isPowerOfFour(int n) {
        return n > 0 && (n & (n - 1)) == 0 && (n & 0xaaaaaaaa) == 0;
    }
}
