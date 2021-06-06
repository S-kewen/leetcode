package com.boot.leetcode.teemoattacking;

/**
 * @PackageName: com.boot.leetcode.teemoattacking
 * @ClassName: TeemoAttacking
 * @Description: This is TeemoAttacking class by Skwen.
 * @Author: Skwen
 * @Date: 2021-06-07 3:55
 */
public class TeemoAttacking {
    public static void main(String[] args) {
        System.out.println(findPoisonedDuration(new int[]{1, 4}, 2));
    }

    public static int findPoisonedDuration(int[] timeSeries, int duration) {
        int n = timeSeries.length;
        if (n == 0) {
            return 0;
        }

        int total = 0;
        for (int i = 0; i < n - 1; ++i) {
            total += Math.min(timeSeries[i + 1] - timeSeries[i], duration);
        }
        return total + duration;
    }
}
