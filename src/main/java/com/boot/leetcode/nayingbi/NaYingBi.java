package com.boot.leetcode.nayingbi;

/**
 * @PackageName: com.boot.leetcode.nayingbi
 * @ClassName: NaYingBi
 * @Description: This is NaYingBi class by Skwen.
 * @Author: Skwen
 * @Date: 2021-05-19 2:01
 */
public class NaYingBi {
    public static void main(String[] args) {
        System.out.println(minCount(new int[]{4, 2, 1}));
    }

    public static int minCount(int[] coins) {
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < coins.length; i++) {
            if (coins[i] == 1) {
                a++;
            } else if (coins[i] == 2) {
                b++;
            } else {
                c = c + ((coins[i] / 2) + (coins[i] % 2));
            }
        }
        return a + b + c;
    }
}
