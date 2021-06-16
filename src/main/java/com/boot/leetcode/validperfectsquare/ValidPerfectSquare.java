package com.boot.leetcode.validperfectsquare;

/**
 * @PackageName: com.boot.leetcode.validperfectsquare
 * @ClassName: ValidPerfectSquare
 * @Description: This is ValidPerfectSquare class by Skwen.
 * @Author: Skwen
 * @Date: 2021-06-17 2:28
 */
public class ValidPerfectSquare {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(16));
    }

    public static boolean isPerfectSquare(int num) {
        if (num < 2) {
            return true;
        }

        long left = 2, right = num / 2, x, guessSquared;
        while (left <= right) {
            x = left + (right - left) / 2;
            guessSquared = x * x;
            if (guessSquared == num) {
                return true;
            }
            if (guessSquared > num) {
                right = x - 1;
            } else {
                left = x + 1;
            }
        }
        return false;
    }
}
