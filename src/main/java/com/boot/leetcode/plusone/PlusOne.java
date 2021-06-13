package com.boot.leetcode.plusone;

/**
 * @PackageName: com.boot.leetcode.plusone
 * @ClassName: PlusOne
 * @Description: This is PlusOne class by Skwen.
 * @Author: Skwen
 * @Date: 2021-06-14 2:55
 */
public class PlusOne {
    public static void main(String[] args) {
        System.out.println(plusOne(new int[]{1, 2, 3}));
    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) {
                return digits;
            }
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
