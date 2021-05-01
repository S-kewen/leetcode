package com.boot.leetcode.nextpermutation;

/**
 * @PackageName: com.boot.leetcode.nextpermutation
 * @ClassName: NextPermutation
 * @Description: This is NextPermutation class by Skwen.
 * @Author: Skwen
 * @Date: 2021-05-02 2:45
 */
public class NextPermutation {
    public static void main(String[] args) {
        int [] nums = {1,2,3};
        nextPermutation(nums);
        for (int i : nums){
            System.out.println(i);
        }
    }

    public static void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        if (i >= 0) {
            int j = nums.length - 1;
            while (j >= 0 && nums[i] >= nums[j]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i + 1);
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void reverse(int[] nums, int start) {
        int left = start, right = nums.length - 1;
        while (left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }
}
