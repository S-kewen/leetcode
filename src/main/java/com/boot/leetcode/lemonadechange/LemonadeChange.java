package com.boot.leetcode.lemonadechange;

/**
 * @PackageName: com.boot.leetcode.lemonadechange
 * @ClassName: LemonadeChange
 * @Description: This is LemonadeChange class by Skwen.
 * @Author: Skwen
 * @Date: 2021-04-30 1:46
 */
public class LemonadeChange {
    public static void main(String[] args) {
        System.out.println(lemonadeChange(new int[]{5, 5, 10, 20}));
    }

    public static boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0;
        for (int bill : bills) {
            if (bill == 5) {
                five++;
            } else if (bill == 10) {
                if (five == 0) {
                    return false;
                }
                five--;
                ten++;
            } else {
                if (five > 0 && ten > 0) {
                    five--;
                    ten--;
                } else if (five >= 3) {
                    five -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
