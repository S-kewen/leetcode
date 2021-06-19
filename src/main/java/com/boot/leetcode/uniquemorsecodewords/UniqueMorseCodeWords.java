package com.boot.leetcode.uniquemorsecodewords;

import java.util.HashSet;
import java.util.Set;

/**
 * @PackageName: com.boot.leetcode.uniquemorsecodewords
 * @ClassName: UniqueMorseCodeWords
 * @Description: This is UniqueMorseCodeWords class by Skwen.
 * @Author: Skwen
 * @Date: 2021-06-19 21:01
 */
public class UniqueMorseCodeWords {
    public static void main(String[] args) {
        System.out.println(uniqueMorseRepresentations(new String[]{"gin", "zen", "gig", "msg"}));
    }

    public static int uniqueMorseRepresentations(String[] words) {
        String[] MORSE = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
                "....", "..", ".---", "-.-", ".-..", "--", "-.",
                "---", ".--.", "--.-", ".-.", "...", "-", "..-",
                "...-", ".--", "-..-", "-.--", "--.."};

        Set<String> seen = new HashSet();
        for (String word : words) {
            StringBuilder code = new StringBuilder();
            for (char c : word.toCharArray()) {
                code.append(MORSE[c - 'a']);
            }
            seen.add(code.toString());
        }

        return seen.size();
    }
}
