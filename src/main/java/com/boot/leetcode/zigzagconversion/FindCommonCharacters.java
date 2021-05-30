package com.boot.leetcode.zigzagconversion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @PackageName: com.boot.leetcode.zigzagconversion
 * @ClassName: FindCommonCharacters
 * @Description: This is FindCommonCharacters class by Skwen.
 * @Author: Skwen
 * @Date: 2021-05-31 2:08
 */
public class FindCommonCharacters {
    public static void main(String[] args) {
        System.out.println(commonChars(new String[]{"bella", "label", "roller"}));
    }

    public static List<String> commonChars(String[] words) {
        int[] minfreq = new int[26];
        Arrays.fill(minfreq, Integer.MAX_VALUE);
        for (String word : words) {
            int[] freq = new int[26];
            int length = word.length();
            for (int i = 0; i < length; ++i) {
                char ch = word.charAt(i);
                ++freq[ch - 'a'];
            }
            for (int i = 0; i < 26; ++i) {
                minfreq[i] = Math.min(minfreq[i], freq[i]);
            }
        }

        List<String> ans = new ArrayList<String>();
        for (int i = 0; i < 26; ++i) {
            for (int j = 0; j < minfreq[i]; ++j) {
                ans.add(String.valueOf((char) (i + 'a')));
            }
        }
        return ans;
    }
}
