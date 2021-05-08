package com.boot.leetcode.closednumberlcci;

/**
 * @PackageName: com.boot.leetcode.closednumberlcci
 * @ClassName: ClosedNumberLcci
 * @Description: This is ClosedNumberLcci class by Skwen.
 * @Author: Skwen
 * @Date: 2021-05-09 2:46
 */
public class ClosedNumberLcci {
    public static void main(String[] args) {
        System.out.println(getPrev(1));
    }

    // 取得前一个较小的数
    private static int getPrev(int n) {
        int temp = n;
        int c0 = 0;
        int c1 = 0;
        while ((temp & 1) == 1) {
            c1++;
            temp >>= 1;
        }

        if (temp == 0) return -1;

        while (((temp & 1) == 0) && (temp != 0)) {
            c0++;
            temp >>= 1;
        }

        int p = c0 + c1; // 最右边，非拖尾1的位置
        n &= ((~0) << (p + 1)); // 将位0到位p清零

        int mask = (1 << (c1 + 1)) - 1; // (c1+1)个1
        n |= mask << (c0 - 1);

        return n;
    }
}
