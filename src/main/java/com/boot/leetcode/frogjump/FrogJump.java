package com.boot.leetcode.frogjump;

import java.util.Arrays;

/**
 * @PackageName: com.boot.leetcode.frogjump
 * @ClassName: FrogJump
 * @Description: This is FrogJump class by Skwen.
 * @Author: Skwen
 * @Date: 2021-04-29 23:17
 */
public class FrogJump {
    private static Boolean[][] rec;

    public static boolean canCross(int[] stones) {
        int n = stones.length;
        rec = new Boolean[n][n];
        return dfs(stones, 0, 0);
    }

    private static boolean dfs(int[] stones, int i, int lastDis) {
        if (i == stones.length - 1) {
            return true;
        }
        if (rec[i][lastDis] != null) {
            return rec[i][lastDis];
        }

        for (int curDis = lastDis - 1; curDis <= lastDis + 1; curDis++) {
            if (curDis > 0) {
                int j = Arrays.binarySearch(stones, i + 1, stones.length, curDis + stones[i]);
                if (j >= 0 && dfs(stones, j, curDis)) {
                    return rec[i][lastDis] = true;
                }
            }
        }
        return rec[i][lastDis] = false;
    }

    public static void main(String[] args) {
        System.out.println(canCross(new int[]{0, 1, 3, 5, 6, 8, 12, 17}));
    }
}
