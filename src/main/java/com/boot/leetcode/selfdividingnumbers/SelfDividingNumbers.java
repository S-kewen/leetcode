package com.boot.leetcode.selfdividingnumbers;

import java.util.ArrayList;
import java.util.List;

/**
 * @PackageName: com.boot.leetcode.selfdividingnumbers
 * @ClassName: SelfDividingNumbers
 * @Description: This is SelfDividingNumbers class by Skwen.
 * @Author: Skwen
 * @Date: 2021-05-27 3:24
 */
public class SelfDividingNumbers {
    public static void main(String[] args) {
        selfDividingNumbers(1, 22);
    }

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList();
        for (int n = left; n <= right; ++n) {
            if (selfDividing(n)) {
                ans.add(n);
            }
        }
        return ans;
    }

    public static boolean selfDividing(int n) {
        for (char c : String.valueOf(n).toCharArray()) {
            if (c == '0' || (n % (c - '0') > 0)) {
                return false;
            }
        }
        return true;
    }
    /*
    Alternate implementation of selfDividing:
    public boolean selfDividing(int n) {
        int x = n;
        while (x > 0) {
            int d = x % 10;
            x /= 10;
            if (d == 0 || (n % d) > 0) return false;
        }
        return true;
    */
}
