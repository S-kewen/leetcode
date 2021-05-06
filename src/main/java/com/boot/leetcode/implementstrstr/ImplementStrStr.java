package com.boot.leetcode.implementstrstr;

/**
 * @PackageName: com.boot.leetcode.implementstrstr
 * @ClassName: ImplementStrStr
 * @Description: This is ImplementStrStr class by Skwen.
 * @Author: Skwen
 * @Date: 2021-05-04 3:47
 */
public class ImplementStrStr {
    public static void main(String[] args) {
        System.out.println(strStr("hello", "ll"));
    }

    public static int strStr(String haystack, String needle) {
        int n = haystack.length(), m = needle.length();
        for (int i = 0; i + m <= n; i++) {
            boolean flag = true;
            for (int j = 0; j < m; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return i;
            }
        }
        return -1;
    }
}
