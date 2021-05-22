package com.boot.leetcode.factorialtrailingzeroes;

import java.math.BigInteger;

/**
 * @PackageName: com.boot.leetcode.factorialtrailingzeroes
 * @ClassName: FactorialTrailingZeroes
 * @Description: This is FactorialTrailingZeroes class by Skwen.
 * @Author: Skwen
 * @Date: 2021-05-23 3:16
 */
public class FactorialTrailingZeroes {
    public static void main(String[] args) {
        System.out.println(trailingZeroes(3));
    }

    public static int trailingZeroes(int n) {

        // Calculate n!
        BigInteger nFactorial = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            nFactorial = nFactorial.multiply(BigInteger.valueOf(i));
        }

        // Count how many 0's are on the end.
        int zeroCount = 0;

        while (nFactorial.mod(BigInteger.TEN).equals(BigInteger.ZERO)) {
            nFactorial = nFactorial.divide(BigInteger.TEN);
            zeroCount++;
        }

        return zeroCount;
    }

}
