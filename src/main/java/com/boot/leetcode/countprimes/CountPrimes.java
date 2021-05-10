package com.boot.leetcode.countprimes;

/**
 * @PackageName: com.boot.leetcode.countprimes
 * @ClassName: CountPrimes
 * @Description: This is CountPrimes class by Skwen.
 * @Author: Skwen
 * @Date: 2021-05-11 0:58
 */
public class CountPrimes {
    public static void main(String[] args) {
        System.out.println(countPrimes(10));
    }

    public static int countPrimes(int n) {
        int ans = 0;
        for (int i = 2; i < n; ++i) {
            ans += isPrime(i) ? 1 : 0;
        }
        return ans;
    }

    public static boolean isPrime(int x) {
        for (int i = 2; i * i <= x; ++i) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

}
