package com.boot.leetcode.validparentheses;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * @PackageName: com.boot.leetcode.validparentheses
 * @ClassName: ValidParentheses
 * @Description: This is ValidParentheses class by Skwen.
 * @Author: Skwen
 * @Date: 2021-05-04 3:50
 */
public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("()"));
    }

    public static boolean isValid(String s) {
        int n = s.length();
        if (n % 2 == 1) {
            return false;
        }

        Map<Character, Character> pairs = new HashMap<Character, Character>() {{
            put(')', '(');
            put(']', '[');
            put('}', '{');
        }};
        Deque<Character> stack = new LinkedList<Character>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (pairs.containsKey(ch)) {
                if (stack.isEmpty() || stack.peek() != pairs.get(ch)) {
                    return false;
                }
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }
}
