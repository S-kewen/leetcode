package com.boot.leetcode.maximum69number;

/**
 * @PackageName: com.boot.leetcode.maximum69number
 * @ClassName: Maximum69Number
 * @Description: This is Maximum69Number class by Skwen.
 * @Author: Skwen
 * @Date: 2021-05-14 1:19
 */
public class Maximum69Number {
    public static void main(String[] args) {
        System.out.println(maximum69Number(9669));
    }

    public static int maximum69Number(int num) {
        StringBuffer s = new StringBuffer(Integer.toString(num));
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '6') {
                s.deleteCharAt(i);
                s.insert(i, '9');
                break;
            }
        }
        return Integer.parseInt(s.toString());
    }
}
