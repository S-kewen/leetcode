package com.boot.leetcode.reducingdishes;

import java.util.Arrays;

/**
 * @PackageName: com.boot.leetcode.reducingdishes
 * @ClassName: ReducingDishes
 * @Description: This is ReducingDishes class by Skwen.
 * @Author: Skwen
 * @Date: 2021-05-24 3:27
 */
public class ReducingDishes {
    public static void main(String[] args) {
        System.out.println(maxSatisfaction(new int[]{-1, -8, 0, 5, -9}));
    }

    public static int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int presum = 0, ans = 0;
        for (int i = satisfaction.length - 1; i >= 0; --i) {
            int si = satisfaction[i];
            if (presum + si > 0) {
                presum += si;
                ans += presum;
            } else {
                break;
            }
        }
        return ans;
    }
}
