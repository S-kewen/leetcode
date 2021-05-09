package com.boot.leetcode.numberof1bits;

/**
 * @PackageName: com.boot.leetcode.numberof1bits
 * @ClassName: NumberOf1Bits
 * @Description: This is NumberOf1Bits class by Skwen.
 * @Author: Skwen
 * @Date: 2021-05-10 2:50
 */
public class NumberOf1Bits {
    public static void main(String[] args) {
        System.out.println(hammingWeight(00000000000000000000000000001011));
    }

    public static int hammingWeight(int n) {
        int ret = 0;
        for (int i = 0; i < 32; i++) {
            if ((n & (1 << i)) != 0) {
                ret++;
            }
        }
        return ret;
    }
}
