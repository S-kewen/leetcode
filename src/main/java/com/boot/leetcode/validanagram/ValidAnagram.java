package com.boot.leetcode.validanagram;

import java.util.Arrays;

/**
 * @PackageName: com.boot.leetcode.validanagram
 * @ClassName: ValidAnagram
 * @Description: This is ValidAnagram class by Skwen.
 * @Author: Skwen
 * @Date: 2021-05-24 3:24
 */
public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1, str2);
    }
}

