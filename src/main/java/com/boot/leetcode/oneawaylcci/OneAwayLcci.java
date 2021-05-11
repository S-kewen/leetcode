package com.boot.leetcode.oneawaylcci;

/**
 * @PackageName: com.boot.leetcode.oneawaylcci
 * @ClassName: OneAwayLcci
 * @Description: This is OneAwayLcci class by Skwen.
 * @Author: Skwen
 * @Date: 2021-05-12 0:03
 */
public class OneAwayLcci {
    public static void main(String[] args) {
        System.out.println(oneEditAway("pale","ple"));
    }


    public static boolean oneEditAway(String first, String second) {

        int f = first.length();
        int s = second.length();

        if (Math.abs(f - s) > 1) {
            return false;
        }
        if (first.equals(second)) {
            return true;
        }

        int count = 0;    // 记录不匹配的次数。
        int i = 0, j = 0; // 用来指向两字符串的指针
        while (i < f && j < s) {

            // 两个字符串从前往后开始遍历，如果当前两字符串字符相同就继续比较下一个。
            if (first.charAt(i++) == second.charAt(j++)) {

                continue;
            }
            count++;
            if (count > 1) {
                return false;
            }

            if (f != s) { // 若不相等，则将短字符串指针前移一位

                if (f > s) {
                    j--;
                } else {
                    i--;
                }
            }
        }
        return true;
    }
}
