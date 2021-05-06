package com.boot.leetcode.t9lcci;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @PackageName: com.boot.leetcode.t9lcci
 * @ClassName: t9lcci
 * @Description: This is t9lcci class by Skwen.
 * @Author: Skwen
 * @Date: 2021-05-05 15:22
 */
public class t9lcci {
    public static void main(String[] args) {
        System.out.println(getValidT9Words("2", new String[]{"a", "b", "c", "d"}));
        ;
    }

    public static List<String> getValidT9Words(String num, String[] words) {
        Map<Character, Character> map = new HashMap<>(26);
        map.put('a', '2');
        map.put('b', '2');
        map.put('c', '2');
        map.put('d', '3');
        map.put('e', '3');
        map.put('f', '3');
        map.put('g', '4');
        map.put('h', '4');
        map.put('i', '4');
        map.put('j', '5');
        map.put('k', '5');
        map.put('l', '5');
        map.put('m', '6');
        map.put('n', '6');
        map.put('o', '6');
        map.put('p', '7');
        map.put('q', '7');
        map.put('r', '7');
        map.put('s', '7');
        map.put('t', '8');
        map.put('u', '8');
        map.put('v', '8');
        map.put('w', '9');
        map.put('x', '9');
        map.put('y', '9');
        map.put('z', '9');

        List<String> ans = new ArrayList<>();
        for (String word : words) {
            boolean match = true;
            for (int i = 0; i < word.length(); i++) {
                char n = num.charAt(i);
                char c = word.charAt(i);
                if (map.get(c) != n) {
                    match = false;
                    break;
                }
            }
            if (match) {
                ans.add(word);
            }
        }
        return ans;
    }
}
