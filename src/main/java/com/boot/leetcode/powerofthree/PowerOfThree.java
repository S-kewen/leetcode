package com.boot.leetcode.powerofthree;

/**
 * @PackageName: com.boot.leetcode.powerofthree
 * @ClassName: PowerOfThree
 * @Description: This is PowerOfThree class by Skwen.
 * @Author: Skwen
 * @Date: 2021-06-11 4:04
 */
public class PowerOfThree {
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(27));
    }

    public static boolean isPowerOfThree(int n) {
        if (n < 1) {
            return false;
        }

        while (n % 3 == 0) {
            n /= 3;
        }

        return n == 1;
    }
}
