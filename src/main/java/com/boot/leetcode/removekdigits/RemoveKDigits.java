package com.boot.leetcode.removekdigits;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @PackageName: com.boot.leetcode.removekdigits
 * @ClassName: RemoveKDigits
 * @Description: This is RemoveKDigits class by Skwen.
 * @Author: Skwen
 * @Date: 2021-05-16 1:03
 */
public class RemoveKDigits {
    public static void main(String[] args) {
        System.out.println(removeKdigits("1432219",3));
    }

    public static String removeKdigits(String num, int k) {
        Deque<Character> deque = new LinkedList<Character>();
        int length = num.length();
        for (int i = 0; i < length; ++i) {
            char digit = num.charAt(i);
            while (!deque.isEmpty() && k > 0 && deque.peekLast() > digit) {
                deque.pollLast();
                k--;
            }
            deque.offerLast(digit);
        }

        for (int i = 0; i < k; ++i) {
            deque.pollLast();
        }

        StringBuilder ret = new StringBuilder();
        boolean leadingZero = true;
        while (!deque.isEmpty()) {
            char digit = deque.pollFirst();
            if (leadingZero && digit == '0') {
                continue;
            }
            leadingZero = false;
            ret.append(digit);
        }
        return ret.length() == 0 ? "0" : ret.toString();
    }
}
