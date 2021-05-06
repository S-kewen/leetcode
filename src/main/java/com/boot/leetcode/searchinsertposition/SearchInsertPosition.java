package com.boot.leetcode.searchinsertposition;

/**
 * @PackageName: com.boot.leetcode.searchinsertposition
 * @ClassName: SearchInsertPosition
 * @Description: This is SearchInsertPosition class by Skwen.
 * @Author: Skwen
 * @Date: 2021-05-02 3:07
 */
public class SearchInsertPosition {
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 5));
    }

    public static int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int left = 0, right = n - 1, ans = n;
        while (left <= right) {
            int mid = ((right - left) >> 1) + left;
            if (target <= nums[mid]) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
}
