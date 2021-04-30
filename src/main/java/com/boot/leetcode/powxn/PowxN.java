package com.boot.leetcode.powxn;

/**
 * @PackageName: com.boot.leetcode.powxn
 * @ClassName: PowxN
 * @Description: This is PowxN class by Skwen.
 * @Author: Skwen
 * @Date: 2021-04-30 22:34
 */
public class PowxN {
    public static void main(String[] args) {
        System.out.println(myPow(6,88));
    }

    public static double myPow(double x, int n) {
        long N = n;
        return N >= 0 ? quickMul(x, N) : 1.0 / quickMul(x, -N);
    }

    public static double quickMul(double x, long N) {
        if (N == 0) {
            return 1.0;
        }
        double y = quickMul(x, N / 2);
        return N % 2 == 0 ? y * y : y * y * x;
    }

}
