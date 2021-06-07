package com.boot.leetcode.tolowercase;

/**
 * @PackageName: com.boot.leetcode.tolowercase
 * @ClassName: ToLowerCase
 * @Description: This is ToLowerCase class by Skwen.
 * @Author: Skwen
 * @Date: 2021-06-08 3:45
 */
public class ToLowerCase {
    public static void main(String[] args) {
        System.out.println(toLowerCase("Hello"));
    }

    public static String toLowerCase(String str) {
        char[] array = str.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 'A' && array[i] <= 'Z') {
                array[i] += 32;
            }
        }
        return new String(array);
    }
}
