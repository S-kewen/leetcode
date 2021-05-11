package com.boot.leetcode.minimumarearectangle;

import java.util.*;

/**
 * @PackageName: com.boot.leetcode.minimumarearectangle
 * @ClassName: MinimumAreaRectangle
 * @Description: This is MinimumAreaRectangle class by Skwen.
 * @Author: Skwen
 * @Date: 2021-05-12 0:09
 */
public class MinimumAreaRectangle {
    public static void main(String[] args) {
        System.out.println(minAreaRect(new int[][]{{1, 1}, {1, 3}, {3, 1}, {3, 3}, {2, 2}}));
    }

    public static int minAreaRect(int[][] points) {
        Map<Integer, List<Integer>> rows = new TreeMap();
        for (int[] point : points) {
            int x = point[0], y = point[1];
            rows.computeIfAbsent(x, z -> new ArrayList()).add(y);
        }

        int ans = Integer.MAX_VALUE;
        Map<Integer, Integer> lastx = new HashMap();
        for (int x : rows.keySet()) {
            List<Integer> row = rows.get(x);
            Collections.sort(row);
            for (int i = 0; i < row.size(); ++i) {
                for (int j = i + 1; j < row.size(); ++j) {
                    int y1 = row.get(i), y2 = row.get(j);
                    int code = 40001 * y1 + y2;
                    if (lastx.containsKey(code)) {
                        ans = Math.min(ans, (x - lastx.get(code)) * (y2 - y1));
                    }
                    lastx.put(code, x);
                }
            }
        }

        return ans < Integer.MAX_VALUE ? ans : 0;
    }

}
