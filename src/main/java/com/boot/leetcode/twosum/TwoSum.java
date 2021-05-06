package com.boot.leetcode.twosum;

/**
 * @PackageName: com.boot.leetcode.twosum
 * @ClassName: TwoSum
 * @Description: This is TwoSum class by Skwen.
 * @Author: Skwen
 * @Date: 2021-04-29 2:29
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] result = twoSum(new int[]{2, 7, 11, 15}, 9);
        for (int i : result) {
            System.out.println(i);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[]{0, 1};
        if (nums.length == 2) {
            return result;
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
}
