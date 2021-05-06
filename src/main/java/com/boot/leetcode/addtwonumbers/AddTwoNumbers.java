package com.boot.leetcode.addtwonumbers;

/**
 * @PackageName: com.boot.leetcode.addtwonumbers
 * @ClassName: AddTwoNumbers
 * @Description: This is AddTwoNumbers class by Skwen.
 * @Author: Skwen
 * @Date: 2021-04-29 22:35
 */
public class AddTwoNumbers {

    public static void main(String[] args) {
        System.out.println(addTwoNumbers(new ListNode(1), new ListNode(2)).val);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // 存储十位数据
        int record = 0;
        // 存储l1节点的数据
        int num1 = 0;
        // 存储l2节点的数据
        int num2 = 0;
        // 存储计算后的结果
        StringBuffer num = new StringBuffer("");
        while (l1 != null || l2 != null) {
            // 三目运算 判断节点l1是否为空，如果为空，节点值为0
            num1 = l1 != null ? l1.val : 0;
            // 三目运算 判断节点l2是否为空，如果为空，节点值为0
            num2 = l2 != null ? l2.val : 0;
            // 将计算好的个位存入结果字符串中
            num.append((num1 + num2 + record) % 10);
            // 记录十位值
            record = (num1 + num2 + record) / 10;
            // 移动l1节点
            l1 = l1 != null ? l1.next : null;
            // 移动l2节点
            l2 = l2 != null ? l2.next : null;
        }
        // 如果不为0，将数据存入结果字符串中
        if (record != 0) {
            num.append(record);
        }
        // 反转字符串，将StringBuffer类型转换为String类型，进行切割字符串
        String[] arr = num.reverse().toString().split("");
        // 创建节点对象
        ListNode node = null;
        for (int i = 0; i < arr.length; i++) {
            // 将节点和改节点的下一个节点对象出入当前节点
            node = new ListNode(Integer.parseInt(arr[i]), node);
        }
        // 将节点返回
        return node;

    }
}
