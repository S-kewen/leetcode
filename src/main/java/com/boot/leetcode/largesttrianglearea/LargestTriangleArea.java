package com.boot.leetcode.largesttrianglearea;

/**
 * @PackageName: com.boot.leetcode.largesttrianglearea
 * @ClassName: LargestTriangleArea
 * @Description: This is LargestTriangleArea class by Skwen.
 * @Author: Skwen
 * @Date: 2021-05-13 1:29
 */
public class LargestTriangleArea {
    public static void main(String[] args) {
        System.out.println(largestTriangleArea(new int[][]{{0,0},{0,1},{1,0},{0,2},{2,0}}));
    }

    public static double largestTriangleArea(int[][] points) {
        int N = points.length;
        double ans = 0;
        for (int i = 0; i < N; ++i) {
            for (int j = i + 1; j < N; ++j) {
                for (int k = j + 1; k < N; ++k) {
                    ans = Math.max(ans, area(points[i], points[j], points[k]));
                }
            }
        }
        return ans;
    }

    public static double area(int[] P, int[] Q, int[] R) {
        return 0.5 * Math.abs(P[0] * Q[1] + Q[0] * R[1] + R[0] * P[1]
                - P[1] * Q[0] - Q[1] * R[0] - R[1] * P[0]);
    }
}
