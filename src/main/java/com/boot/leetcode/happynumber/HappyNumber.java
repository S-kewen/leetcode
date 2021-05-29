package com.boot.leetcode.happynumber;

import java.util.HashSet;
import java.util.Set;

/**
 * @PackageName: com.boot.leetcode.happynumber
 * @ClassName: HappyNumber
 * @Description: This is HappyNumber class by Skwen.
 * @Author: Skwen
 * @Date: 2021-05-30 3:43
 */
public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(getNext(11));
    }
    private static int getNext(int n) {
        int totalSum = 0;
        while (n > 0) {
            int d = n % 10;
            n = n / 10;
            totalSum += d * d;
        }
        return totalSum;
    }

    public static boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = getNext(n);
        }
        return n == 1;
    }
}
