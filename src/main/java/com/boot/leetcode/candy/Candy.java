package com.boot.leetcode.candy;

/**
 * @PackageName: com.boot.leetcode.candy
 * @ClassName: Candy
 * @Description: This is Candy class by Skwen.
 * @Author: Skwen
 * @Date: 2021-05-25 3:25
 */
public class Candy {
    public static void main(String[] args) {
        System.out.println(candy(new int[]{1, 0, 2}));
    }

    public static int candy(int[] ratings) {
        int n = ratings.length;
        int[] left = new int[n];
        for (int i = 0; i < n; i++) {
            if (i > 0 && ratings[i] > ratings[i - 1]) {
                left[i] = left[i - 1] + 1;
            } else {
                left[i] = 1;
            }
        }
        int right = 0, ret = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (i < n - 1 && ratings[i] > ratings[i + 1]) {
                right++;
            } else {
                right = 1;
            }
            ret += Math.max(left[i], right);
        }
        return ret;
    }
}
