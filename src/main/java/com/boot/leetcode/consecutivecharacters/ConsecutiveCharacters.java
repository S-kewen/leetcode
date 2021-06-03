package com.boot.leetcode.consecutivecharacters;

/**
 * @PackageName: com.boot.leetcode.consecutivecharacters
 * @ClassName: ConsecutiveCharacters
 * @Description: This is ConsecutiveCharacters class by Skwen.
 * @Author: Skwen
 * @Date: 2021-06-03 16:49
 */
public class ConsecutiveCharacters {
    public static void main(String[] args) {
        System.out.println(maxPower("leetcode"));
    }

    public static int maxPower(String s) {
        int ans = 0, count = 1;
        char prev = s.charAt(0);
        char[] cs = s.toCharArray();
        for (int i = 1; i < cs.length; ++i) {
            if (cs[i] != prev) {
                ans = Math.max(count, ans);
                prev = cs[i];
                count = 1;
            } else {
                count++;
            }
        }
        return Math.max(ans, count);
    }
}
