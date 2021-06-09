package com.boot.leetcode.pascalstriangle;

import java.util.ArrayList;
import java.util.List;

/**
 * @PackageName: com.boot.leetcode.pascalstriangle
 * @ClassName: PascalsTriangle
 * @Description: This is PascalsTriangle class by Skwen.
 * @Author: Skwen
 * @Date: 2021-06-10 4:11
 */
public class PascalsTriangle {
    public static void main(String[] args) {
        System.out.println(generate(5));
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        for (int i = 0; i < numRows; ++i) {
            List<Integer> row = new ArrayList<Integer>();
            for (int j = 0; j <= i; ++j) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(ret.get(i - 1).get(j - 1) + ret.get(i - 1).get(j));
                }
            }
            ret.add(row);
        }
        return ret;
    }
}
