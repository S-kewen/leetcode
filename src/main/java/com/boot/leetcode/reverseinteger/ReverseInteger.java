package com.boot.leetcode.reverseinteger;

/**
 * @PackageName: com.boot.leetcode.reverseinteger
 * @ClassName: ReverseInteger
 * @Description: This is ReverseInteger class by Skwen.
 * @Author: Skwen
 * @Date: 2021-04-29 2:35
 */
public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverseInteger(123));
    }
    public static int reverseInteger(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0;
            }
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0;
            }
            rev = rev * 10 + pop;
        }
        return rev;
    }
}
