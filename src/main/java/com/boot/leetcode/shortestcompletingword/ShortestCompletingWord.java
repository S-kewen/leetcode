package com.boot.leetcode.shortestcompletingword;

/**
 * @PackageName: com.boot.leetcode.shortestcompletingword
 * @ClassName: ShortestCompletingWord
 * @Description: This is ShortestCompletingWord class by Skwen.
 * @Author: Skwen
 * @Date: 2021-05-14 1:16
 */
public class ShortestCompletingWord {
    public static void main(String[] args) {
        System.out.println(shortestCompletingWord("1s3 PSt",new String[]{"step", "steps", "stripe", "stepple"}));
    }

    public static String shortestCompletingWord(String licensePlate, String[] words) {
        int[] target = count(licensePlate);
        String ans = "";
        for (String word : words) {
            if ((word.length() < ans.length() || ans.length() == 0) &&
                    dominates(count(word.toLowerCase()), target)) {
                ans = word;
            }
        }
        return ans;
    }

    public static boolean dominates(int[] count1, int[] count2) {
        for (int i = 0; i < 26; ++i) {
            if (count1[i] < count2[i]) {
                return false;
            }
        }
        return true;
    }

    public static int[] count(String word) {
        int[] ans = new int[26];
        for (char letter : word.toCharArray()) {
            int index = Character.toLowerCase(letter) - 'a';
            if (0 <= index && index < 26) {
                ans[index]++;
            }
        }
        return ans;
    }
}
