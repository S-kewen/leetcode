package com.boot.leetcode.convertintegerlcci;

/**
 * @PackageName: com.boot.leetcode.convertintegerlcci
 * @ClassName: ConvertIntegerLcci
 * @Description: This is ConvertIntegerLcci class by Skwen.
 * @Author: Skwen
 * @Date: 2021-06-06 2:46
 */
public class ConvertIntegerLcci {
    public static void main(String[] args) {
        System.out.println(convertInteger(29, 15));
    }

    public static int convertInteger(int A, int B) {
        return Integer.bitCount(A ^ B);
    }

}
