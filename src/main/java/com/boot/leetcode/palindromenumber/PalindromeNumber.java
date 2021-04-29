package com.boot.leetcode.palindromenumber;

/**
 * @PackageName: com.boot.leetcode.palindromenumber
 * @ClassName: PalindromeNumber
 * @Description: This is PalindromeNumber class by Skwen.
 * @Author: Skwen
 * @Date: 2021-04-30 1:39
 */
public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int help = 1;
        int tmp = x;
        while (tmp >= 10) {
            help *= 10;
            tmp /= 10;
        }
        while (x != 0) {
            if (x % 10 != x / help) {
                return false;
            }
            x = x % help / 10;
            help /= 100;
        }
        return true;
    }
}
