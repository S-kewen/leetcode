package com.boot.leetcode.smallestrangei;

/**
 * @PackageName: com.boot.leetcode.smallestrangei
 * @ClassName: SmallestRangeI
 * @Description: This is SmallestRangeI class by Skwen.
 * @Author: Skwen
 * @Date: 2021-05-13 1:35
 */
public class SmallestRangeI {
    public static void main(String[] args) {
        System.out.println(smallestRangeI(new int[]{1}, 0));
    }

    public static int smallestRangeI(int[] A, int K) {
        int min = A[0], max = A[0];
        for (int x : A) {
            min = Math.min(min, x);
            max = Math.max(max, x);
        }
        return Math.max(0, max - min - 2 * K);
    }
}
