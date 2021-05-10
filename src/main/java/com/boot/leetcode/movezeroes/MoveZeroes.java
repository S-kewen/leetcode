package com.boot.leetcode.movezeroes;

/**
 * @PackageName: com.boot.leetcode.movezeroes
 * @ClassName: MoveZeroes
 * @Description: This is MoveZeroes class by Skwen.
 * @Author: Skwen
 * @Date: 2021-05-11 1:00
 */
public class MoveZeroes {
    public static void main(String[] args) {
        int [] arr = new int[]{0,1,0,3,12};
        moveZeroes(arr);
        for (int i:arr){
            System.out.println(i);
        }
    }

    public static void moveZeroes(int[] nums) {
        int n = nums.length, left = 0, right = 0;
        while (right < n) {
            if (nums[right] != 0) {
                swap(nums, left, right);
                left++;
            }
            right++;
        }
    }

    public static void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
