package com.boot.leetcode.divingboardlcci;

/**
 * @PackageName: com.boot.leetcode.divingboardlcci
 * @ClassName: DivingBoardLcci
 * @Description: This is DivingBoardLcci class by Skwen.
 * @Author: Skwen
 * @Date: 2021-05-17 0:09
 */
public class DivingBoardLcci {
    public static void main(String[] args) {
        System.out.println(divingBoard(1,2,3));
    }

    public static int[] divingBoard(int shorter, int longer, int k) {
        if (k == 0) {
            return new int[0];
        }
        if (shorter == longer) {
            return new int[]{shorter * k};
        }
        int[] lengths = new int[k + 1];
        for (int i = 0; i <= k; i++) {
            lengths[i] = shorter * (k - i) + longer * i;
        }
        return lengths;
    }
}
