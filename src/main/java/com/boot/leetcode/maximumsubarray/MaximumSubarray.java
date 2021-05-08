package com.boot.leetcode.maximumsubarray;

/**
 * @PackageName: com.boot.leetcode.maximumsubarray
 * @ClassName: MaximumSubarray
 * @Description: This is MaximumSubarray class by Skwen.
 * @Author: Skwen
 * @Date: 2021-05-09 2:15
 */
public class MaximumSubarray {
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
    }
    public static int maxSubArray(int[] nums) {
        int ans = nums[0];
        int sum = 0;
        for (int num : nums) {
            if (sum > 0) {
                sum += num;
            } else {
                sum = num;
            }
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}
