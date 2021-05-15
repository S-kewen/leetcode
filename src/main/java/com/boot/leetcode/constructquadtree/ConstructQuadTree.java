package com.boot.leetcode.constructquadtree;

/**
 * @PackageName: com.boot.leetcode.constructquadtree
 * @ClassName: ConstructQuadTree
 * @Description: This is ConstructQuadTree class by Skwen.
 * @Author: Skwen
 * @Date: 2021-05-16 1:06
 */
public class ConstructQuadTree {
    public static void main(String[] args) {
        System.out.println(construct(new int[][]{{0, 1}, {1, 0}}));
    }


    public static Node construct(int[][] grid) {
        //left, right, up, down
        return helper(grid, 0, grid.length - 1, 0, grid[0].length - 1);
    }

    private static Node helper(int[][] grid, int left, int right, int up, int down) {
        Node root = new Node();
        if (isSame(grid, left, right, up, down)) {
            root.val = grid[up][left] == 1 ? true : false;
            root.isLeaf = true;
            return root;
        }

        root.isLeaf = false;
        root.topLeft = helper(grid, left, (right + left) / 2, up, (up + down) / 2);
        root.topRight = helper(grid, (right + left) / 2 + 1, right, up, (up + down) / 2);
        root.bottomLeft = helper(grid, left, (right + left) / 2, (up + down) / 2 + 1, down);
        root.bottomRight = helper(grid, (right + left) / 2 + 1, right, (up + down) / 2 + 1, down);

        return root;
    }

    private static boolean isSame(int[][] grid, int left, int right, int up, int down) {
        int pre = -1;
        for (int i = up; i <= down; i++) {
            for (int j = left; j <= right; j++) {
                if (pre != -1) {
                    if (pre != grid[i][j]) {
                        return false;
                    }
                } else {
                    pre = grid[i][j];
                }
            }
        }


        return true;
    }
}
