package com.boot.leetcode.checkiftwostringarraysareequivalent;

/**
 * @PackageName: com.boot.leetcode.checkiftwostringarraysareequivalent
 * @ClassName: CheckIfTwoStringArraysAreEquivalent
 * @Description: This is CheckIfTwoStringArraysAreEquivalent class by Skwen.
 * @Author: Skwen
 * @Date: 2021-05-16 1:09
 */
public class CheckIfTwoStringArraysAreEquivalent {
    public static void main(String[] args) {
        System.out.println(arrayStringsAreEqual(new String[]{"ab", "c"}, new String[]{"a", "bc"}));
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuffer s1 = new StringBuffer();
        StringBuffer s2 = new StringBuffer();
        for (int i = 0; i < word1.length; i++) {
            s1.append(word1[i]);
        }
        for (int i = 0; i < word2.length; i++) {
            s2.append(word2[i]);
        }
        if (new String(s1).equals(new String(s2))) {
            return true;
        }
        return false;

    }
}
