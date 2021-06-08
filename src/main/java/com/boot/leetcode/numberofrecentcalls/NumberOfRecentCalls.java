package com.boot.leetcode.numberofrecentcalls;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @PackageName: com.boot.leetcode.numberofrecentcalls
 * @ClassName: NumberOfRecentCalls
 * @Description: This is NumberOfRecentCalls class by Skwen.
 * @Author: Skwen
 * @Date: 2021-06-09 3:55
 */
public class NumberOfRecentCalls {
    static Queue<Integer> q = new LinkedList();

    public static int ping(int t) {
        q.add(t);
        while (q.peek() < t - 3000) {
            q.poll();
        }
        return q.size();
    }
}
