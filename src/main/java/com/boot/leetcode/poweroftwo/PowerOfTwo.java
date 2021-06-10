package com.boot.leetcode.poweroftwo;

/**
 * @PackageName: com.boot.leetcode.poweroftwo
 * @ClassName: PowerOfTwo
 * @Description: This is PowerOfTwo class by Skwen.
 * @Author: Skwen
 * @Date: 2021-06-11 4:02
 */
public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(1));
    }

    public static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & -n) == n;
    }
}
