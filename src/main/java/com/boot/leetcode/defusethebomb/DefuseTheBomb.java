package com.boot.leetcode.defusethebomb;

import java.util.Arrays;

/**
 * @PackageName: com.boot.leetcode.defusethebomb
 * @ClassName: DefuseTheBomb
 * @Description: This is DefuseTheBomb class by Skwen.
 * @Author: Skwen
 * @Date: 2021-05-15 2:03
 */
public class DefuseTheBomb {
    public static void main(String[] args) {
        System.out.println(decrypt(new int[]{5, 7, 1, 4},3));
    }

    public static int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] res = new int[n];
        if (k == 0) {
            Arrays.fill(code, 0);
        } else if (k > 0) {
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < i + 1 + k; j++) {
                    res[i] += code[j % n];
                }
            }
        } else {
            for (int i = 0; i < n; i++) {
                for (int j = i - 1; j > i - 1 + k; j--) {
                    int x = j;
                    while (x < 0) {
                        x = n + x;
                    }
                    res[i] += code[x];
                }
            }
        }
        return res;
    }
}
