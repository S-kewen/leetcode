package com.boot.leetcode.arrangingcoins;

/**
 * @PackageName: com.boot.leetcode.arrangingcoins
 * @ClassName: ArrangingCoins
 * @Description: This is ArrangingCoins class by Skwen.
 * @Author: Skwen
 * @Date: 2021-06-01 4:38
 */
public class ArrangingCoins {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(5));
    }

    public static int arrangeCoins(int n) {
        long N = n;
        long left = 1, right = (long) Math.sqrt(2 * N);
        long res;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            res = mid * (1 + mid) / 2;
            if (res <= N) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return (int) left - 1;
    }
}
