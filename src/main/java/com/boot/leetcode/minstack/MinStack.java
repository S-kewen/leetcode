package com.boot.leetcode.minstack;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @PackageName: com.boot.leetcode.minstack
 * @ClassName: MinStack
 * @Description: This is MinStack class by Skwen.
 * @Author: Skwen
 * @Date: 2021-06-25 3:20
 */
public class MinStack {
    static Deque<Integer> xStack;
    static Deque<Integer> minStack;

    public MinStack() {
        xStack = new LinkedList<Integer>();
        minStack = new LinkedList<Integer>();
        minStack.push(Integer.MAX_VALUE);
    }

    public void push(int x) {
        xStack.push(x);
        minStack.push(Math.min(minStack.peek(), x));
    }

    public void pop() {
        xStack.pop();
        minStack.pop();
    }

    public int top() {
        return xStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
