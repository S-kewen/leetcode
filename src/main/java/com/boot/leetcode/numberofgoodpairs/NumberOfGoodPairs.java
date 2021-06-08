package com.boot.leetcode.numberofgoodpairs;

/**
 * @PackageName: com.boot.leetcode.numberofgoodpairs
 * @ClassName: NumberOfGoodPairs
 * @Description: This is NumberOfGoodPairs class by Skwen.
 * @Author: Skwen
 * @Date: 2021-06-09 3:52
 */
public class NumberOfGoodPairs {
    public static void main(String[] args) {
        System.out.println(numIdenticalPairs(new int[]{1, 2, 3, 1, 1, 3}));
    }

    public static int numIdenticalPairs(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; ++i) {
            for (int j = i + 1; j < nums.length; ++j) {
                if (nums[i] == nums[j]) {
                    ++ans;
                }
            }
        }
        return ans;
    }
}
