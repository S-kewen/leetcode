package com.boot.leetcode.sqrtx;

/**
 * @PackageName: com.boot.leetcode.sqrtx
 * @ClassName: Sqrtx
 * @Description: This is Sqrtx class by Skwen.
 * @Author: Skwen
 * @Date: 2021-05-22 3:29
 */
public class Sqrtx {
    public static void main(String[] args) {
        System.out.println(mySqrt(4));
    }
    public static int mySqrt(int x) {
        int l = 0, r = x, ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if ((long) mid * mid <= x) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

}
