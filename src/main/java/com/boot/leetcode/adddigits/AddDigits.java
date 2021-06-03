package com.boot.leetcode.adddigits;

/**
 * @PackageName: com.boot.leetcode.adddigits
 * @ClassName: AddDigits
 * @Description: This is AddDigits class by Skwen.
 * @Author: Skwen
 * @Date: 2021-06-03 16:47
 */
public class AddDigits {
    public static void main(String[] args) {
        System.out.println(addDigits(38));
    }

    public static int addDigits(int num) {
        return (num - 1) % 9 + 1;
    }
}
