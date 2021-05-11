package com.boot.leetcode.ransomnote;

/**
 * @PackageName: com.boot.leetcode.ransomnote
 * @ClassName: RansomNote
 * @Description: This is RansomNote class by Skwen.
 * @Author: Skwen
 * @Date: 2021-05-11 23:58
 */
public class RansomNote {
    public static void main(String[] args) {
        System.out.println(canConstruct("aa","aab"));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        // 统计 ransom 字符
        int[] chars = new int[26];
        int ransomLen = ransomNote.length();
        for (int i = 0; i < ransomLen; i++) {
            chars[ransomNote.charAt(i) - 97]++;
        }
        // 遍历 magazine
        for (int i = 0, len = magazine.length(); i < len && ransomLen > 0; i++) {
            if (chars[magazine.charAt(i) - 97] != 0) {
                chars[magazine.charAt(i) - 97]--;
                ransomLen--;
            }
        }
        return ransomLen == 0;
    }
}
