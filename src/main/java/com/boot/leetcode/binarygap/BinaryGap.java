package com.boot.leetcode.binarygap;

/**
 * @PackageName: com.boot.leetcode.binarygap
 * @ClassName: BinaryGap
 * @Description: This is BinaryGap class by Skwen.
 * @Author: Skwen
 * @Date: 2021-05-13 1:33
 */
public class BinaryGap {
    public static void main(String[] args) {
        System.out.println(binaryGap(22));
    }

    public static int binaryGap(int N) {
        int[] A = new int[32];
        int t = 0;
        for (int i = 0; i < 32; ++i) {
            if (((N >> i) & 1) != 0) {
                A[t++] = i;
            }
        }

        int ans = 0;
        for (int i = 0; i < t - 1; ++i) {
            ans = Math.max(ans, A[i + 1] - A[i]);
        }
        return ans;
    }
}
