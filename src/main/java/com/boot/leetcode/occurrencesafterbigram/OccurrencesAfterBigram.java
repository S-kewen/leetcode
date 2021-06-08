package com.boot.leetcode.occurrencesafterbigram;

import java.util.ArrayList;
import java.util.List;

/**
 * @PackageName: com.boot.leetcode.occurrencesafterbigram
 * @ClassName: OccurrencesAfterBigram
 * @Description: This is OccurrencesAfterBigram class by Skwen.
 * @Author: Skwen
 * @Date: 2021-06-09 3:53
 */
public class OccurrencesAfterBigram {
    public static void main(String[] args) {
        System.out.println(findOcurrences("alice is a good girl she is a good student", "a", "good"));
    }

    public static String[] findOcurrences(String text, String first, String second) {
        // 首先按照 " " 空格去切分字符串
        String[] words = text.split(" ");
        List<String> list = new ArrayList<>();
        // 然后按照规则直接检查就可以了
        for (int i = 0; i < words.length - 2; ++i) {
            if (words[i].equals(first) && words[i + 1].equals(second))
            // 遇到符合要求的，直接添加进返回值
            {
                list.add(words[i + 2]);
            }
        }
        String[] ans = new String[list.size()];
        list.toArray(ans);
        return ans;
    }
}
