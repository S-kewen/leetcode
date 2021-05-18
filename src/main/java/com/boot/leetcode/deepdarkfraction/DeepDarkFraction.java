package com.boot.leetcode.deepdarkfraction;

/**
 * @PackageName: com.boot.leetcode.deepdarkfraction
 * @ClassName: DeepDarkFraction
 * @Description: This is DeepDarkFraction class by Skwen.
 * @Author: Skwen
 * @Date: 2021-05-19 1:59
 */
public class DeepDarkFraction {
    public static void main(String[] args) {
        System.out.println(fraction(new int[]{3, 2, 0, 2}));
    }

    public static int[] fraction(int[] cont) {
        if (cont.length == 1) {
            return new int[]{cont[0], 1};
        }
        int n = cont[cont.length - 1];
        int m = 1;
        for (int i = cont.length - 2; i >= 0; --i) {
            int tmp = n;
            n = cont[i] * n + m;
            m = tmp;
        }
        return new int[]{n, m};
    }

}
