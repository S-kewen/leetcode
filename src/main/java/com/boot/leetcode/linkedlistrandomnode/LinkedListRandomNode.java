package com.boot.leetcode.linkedlistrandomnode;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @PackageName: com.boot.leetcode.linkedlistrandomnode
 * @ClassName: LinkedListRandomNode
 * @Description: This is LinkedListRandomNode class by Skwen.
 * @Author: Skwen
 * @Date: 2021-05-08 20:20
 */
public class LinkedListRandomNode {
    static private ListNode head;

    static private Random random = new Random();

    static private List<Integer> list = new ArrayList();
    public static void main(String[] args) {
        System.out.println(getRandom());
    }

    public static int getRandom() {
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        int index = random.nextInt(list.size());
        return list.get(index);
    }
}
