package com.boot.leetcode.stringrotationlcci;

/**
 * @PackageName: com.boot.leetcode.stringrotationlcci
 * @ClassName: StringRotationLcc
 * @Description: This is StringRotationLcc class by Skwen.
 * @Author: Skwen
 * @Date: 2021-05-17 0:08
 */
public class StringRotationLcc {
    public static void main(String[] args) {
        System.out.println(isFlipedString("waterbottle", "erbottlewat"));
    }

    public static boolean isFlipedString(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        String s = s2 + s2;
        return s.contains(s1);
    }
}
