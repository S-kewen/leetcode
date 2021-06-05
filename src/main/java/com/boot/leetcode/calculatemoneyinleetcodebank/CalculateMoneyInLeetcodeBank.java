package com.boot.leetcode.calculatemoneyinleetcodebank;

/**
 * @PackageName: com.boot.leetcode.calculatemoneyinleetcodebank
 * @ClassName: CalculateMoneyInLeetcodeBank
 * @Description: This is CalculateMoneyInLeetcodeBank class by Skwen.
 * @Author: Skwen
 * @Date: 2021-06-06 2:51
 */
public class CalculateMoneyInLeetcodeBank {
    public static void main(String[] args) {
        System.out.println(totalMoney(4));
    }

    public static int totalMoney(int n) {
        int r = n / 7;
        int mod = n % 7;
        return (28 * r)
                + (7 * r * (r - 1) / 2)
                + (r * mod)
                + (mod * (mod + 1) / 2);
    }
}
