package com.boot.leetcode.partitionarrayintodisjointintervals;

/**
 * @PackageName: com.boot.leetcode.partitionarrayintodisjointintervals
 * @ClassName: PartitionArrayIntoDisjointIntervals
 * @Description: This is PartitionArrayIntoDisjointIntervals class by Skwen.
 * @Author: Skwen
 * @Date: 2021-05-23 3:19
 */
public class PartitionArrayIntoDisjointIntervals {
    public static void main(String[] args) {
        System.out.println(partitionDisjoint(new int[]{5, 0, 3, 8, 6}));
    }

    public static int partitionDisjoint(int[] A) {
        int N = A.length;
        int[] maxleft = new int[N];
        int[] minright = new int[N];

        int m = A[0];
        for (int i = 0; i < N; ++i) {
            m = Math.max(m, A[i]);
            maxleft[i] = m;
        }

        m = A[N - 1];
        for (int i = N - 1; i >= 0; --i) {
            m = Math.min(m, A[i]);
            minright[i] = m;
        }

        for (int i = 1; i < N; ++i) {
            if (maxleft[i - 1] <= minright[i]) {
                return i;
            }
        }

        throw null;
    }

}
