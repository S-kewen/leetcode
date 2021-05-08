package com.boot.leetcode.linkedlistrandomnode;

/**
 * @PackageName: com.boot.leetcode.linkedlistrandomnode
 * @ClassName: ListNode
 * @Description: This is ListNode class by Skwen.
 * @Author: Skwen
 * @Date: 2021-05-08 20:22
 */
public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
