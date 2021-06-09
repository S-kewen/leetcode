package com.boot.leetcode.pascalstriangleii;

import java.util.ArrayList;
import java.util.List;

/**
 * @PackageName: com.boot.leetcode.pascalstriangleii
 * @ClassName: PascalsTriangleIi
 * @Description: This is PascalsTriangleIi class by Skwen.
 * @Author: Skwen
 * @Date: 2021-06-10 4:12
 */
public class PascalsTriangleIi {
    public static void main(String[] args) {
        System.out.println(getRow(3));
    }

    public static List<Integer> getRow(int rowIndex) {
        List<List<Integer>> C = new ArrayList<List<Integer>>();
        for (int i = 0; i <= rowIndex; ++i) {
            List<Integer> row = new ArrayList<Integer>();
            for (int j = 0; j <= i; ++j) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(C.get(i - 1).get(j - 1) + C.get(i - 1).get(j));
                }
            }
            C.add(row);
        }
        return C.get(rowIndex);
    }
}
