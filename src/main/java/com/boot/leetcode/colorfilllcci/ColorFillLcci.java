package com.boot.leetcode.colorfilllcci;

/**
 * @PackageName: com.boot.leetcode.colorfilllcci
 * @ClassName: ColorFillLcci
 * @Description: This is ColorFillLcci class by Skwen.
 * @Author: Skwen
 * @Date: 2021-06-06 2:49
 */
public class ColorFillLcci {
    static int m, n;   // 数组大小
    static boolean[][] v = new boolean[55][55];    // 已经访问的节点为true
    static int[] dx = new int[]{-1, 0, 1, 0}, dy = new int[]{0, 1, 0, -1};    // 枚举 上右下左 四个方向

    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        m = image.length;
        n = image[0].length;
        dfs(image, sr, sc);

        // 联通的节点改颜色
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (v[i][j]) {
                    image[i][j] = newColor;
                }
            }
        }
        return image;
    }

    private static void dfs(int[][] image, int sr, int sc) {
        v[sr][sc] = true;
        for (int i = 0; i < 4; i++) {
            int x = sr + dx[i], y = sc + dy[i];
            // 数组未越界 && 节点未访问 && 下一个节点与当前节点联通
            if (x >= 0 && x < m && y >= 0 && y < n && !v[x][y] && image[x][y] == image[sr][sc]) {
                dfs(image, x, y);
            }
        }
    }
}
