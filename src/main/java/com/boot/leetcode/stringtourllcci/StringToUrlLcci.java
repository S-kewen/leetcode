package com.boot.leetcode.stringtourllcci;

/**
 * @PackageName: com.boot.leetcode.stringtourllcci
 * @ClassName: StringToUrlLcci
 * @Description: This is StringToUrlLcci class by Skwen.
 * @Author: Skwen
 * @Date: 2021-05-17 0:05
 */
public class StringToUrlLcci {
    public static void main(String[] args) {
        System.out.println(replaceSpaces("Mr John Smith    ",13));
    }
    public static String replaceSpaces(String S, int length) {
        return S.substring(0, length).replaceAll(" ", "%20");
    }
}
