package com.boot.leetcode.queshideshuzilcof;

/**
 * @PackageName: com.boot.leetcode.queshideshuzilcof
 * @ClassName: QueShiDeShuZiLcof
 * @Description: This is QueShiDeShuZiLcof class by Skwen.
 * @Author: Skwen
 * @Date: 2021-05-18 3:29
 */
public class QueShiDeShuZiLcof {
    public static void main(String[] args) {
        System.out.println(missingNumber(new int[] {0,1,3}));
    }

    public static int missingNumber(int[] nums) {
        int i = 0, j = nums.length - 1;
        while (i <= j) {
            int m = (i + j) / 2;
            if (nums[m] == m) {
                i = m + 1;
            } else {
                j = m - 1;
            }
        }
        return i;
    }
}
