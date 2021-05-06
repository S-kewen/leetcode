package com.boot.leetcode.findthetownjudge;

/**
 * @PackageName: com.boot.leetcode.findthetownjudge
 * @ClassName: FindTheTownJudge
 * @Description: This is FindTheTownJudge class by Skwen.
 * @Author: Skwen
 * @Date: 2021-05-06 22:54
 */
public class FindTheTownJudge {
    public static void main(String[] args) {
        System.out.println(findJudge(2, new int[][]{{1, 2}}));
    }

    public static int findJudge(int N, int[][] trust) {
        int[] arr1 = new int[N + 1];
        int[] arr2 = new int[N + 1];
        for (int[] t : trust) {
            arr1[t[0]] += 1;
            arr2[t[1]] += 1;
        }
        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i] == 0) {
                return arr2[i] == N - 1 ? i : -1;
            }
        }
        return -1;
    }
}
