package com.boot.leetcode.baseballgame;

import java.util.Stack;

/**
 * @PackageName: com.boot.leetcode.baseballgame
 * @ClassName: BaseballGame
 * @Description: This is BaseballGame class by Skwen.
 * @Author: Skwen
 * @Date: 2021-06-03 16:45
 */
public class BaseballGame {
    public static void main(String[] args) {
        System.out.println(calPoints(new String[]{"5", "2", "C", "D", "+"}));
    }

    public static int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack();

        for (String op : ops) {
            if (op.equals("+")) {
                int top = stack.pop();
                int newtop = top + stack.peek();
                stack.push(top);
                stack.push(newtop);
            } else if (op.equals("C")) {
                stack.pop();
            } else if (op.equals("D")) {
                stack.push(2 * stack.peek());
            } else {
                stack.push(Integer.valueOf(op));
            }
        }

        int ans = 0;
        for (int score : stack) {
            ans += score;
        }
        return ans;
    }
}
