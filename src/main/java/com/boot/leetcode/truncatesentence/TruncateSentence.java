package com.boot.leetcode.truncatesentence;

/**
 * @PackageName: com.boot.leetcode.truncatesentence
 * @ClassName: TruncateSentence
 * @Description: This is TruncateSentence class by Skwen.
 * @Author: Skwen
 * @Date: 2021-05-19 2:03
 */
public class TruncateSentence {
    public static void main(String[] args) {
        System.out.println(truncateSentence("Hello how are you Contestant", 4));
    }

    public static String truncateSentence(String s, int k) {
        int cnt = 0;
        StringBuffer ans = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                cnt++;
            }
            if (cnt == k) {
                break;
            }
            ans.append(s.charAt(i));
        }
        return ans.toString();
    }
}
