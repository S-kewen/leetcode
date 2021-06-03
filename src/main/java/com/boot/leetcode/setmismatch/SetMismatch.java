package com.boot.leetcode.setmismatch;

/**
 * @PackageName: com.boot.leetcode.setmismatch
 * @ClassName: SetMismatch
 * @Description: This is SetMismatch class by Skwen.
 * @Author: Skwen
 * @Date: 2021-06-04 1:10
 */
public class SetMismatch {
    public static void main(String[] args) {
        System.out.println(findErrorNums(new int[]{1, 2, 2, 4}));
    }

    public static int[] findErrorNums(int[] nums) {
        int dup = -1, missing = -1;
        for (int i = 1; i <= nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == i) {
                    count++;
                }
            }
            if (count == 2) {
                dup = i;
            } else if (count == 0) {
                missing = i;
            }
        }
        return new int[]{dup, missing};
    }
}
