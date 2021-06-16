package com.boot.leetcode.waterbottles;

/**
 * @PackageName: com.boot.leetcode.waterbottles
 * @ClassName: WaterBottles
 * @Description: This is WaterBottles class by Skwen.
 * @Author: Skwen
 * @Date: 2021-06-16 22:20
 */
public class WaterBottles {
    public static void main(String[] args) {
        System.out.println(numWaterBottles(9, 3));
    }

    public static int numWaterBottles(int numBottles, int numExchange) {
        int bottle = numBottles, ans = numBottles;
        while (bottle >= numExchange) {
            bottle -= numExchange;
            ++ans;
            ++bottle;
        }
        return ans;
    }
}
