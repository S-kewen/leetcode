package com.boot.leetcode.targetsum;

/**
 * @PackageName: com.boot.leetcode.targetsum
 * @ClassName: TargetSum
 * @Description: This is TargetSum class by Skwen.
 * @Author: Skwen
 * @Date: 2021-06-07 3:51
 */
public class TargetSum {
    static int count = 0;

    public static void main(String[] args) {
        System.out.println(findTargetSumWays(new int[]{1, 1, 1, 1, 1}, 3));
    }


    public static int findTargetSumWays(int[] nums, int target) {
        backtrack(nums, target, 0, 0);
        return count;
    }

    public static void backtrack(int[] nums, int target, int index, int sum) {
        if (index == nums.length) {
            if (sum == target) {
                count++;
            }
        } else {
            backtrack(nums, target, index + 1, sum + nums[index]);
            backtrack(nums, target, index + 1, sum - nums[index]);
        }
    }
}
