package com.boot.leetcode.perfectnumber;

/**
 * @PackageName: com.boot.leetcode.perfectnumber
 * @ClassName: PerfectNumber
 * @Description: This is PerfectNumber class by Skwen.
 * @Author: Skwen
 * @Date: 2021-06-08 3:47
 */
public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(checkPerfectNumber(1));
    }

    public static boolean checkPerfectNumber(int num) {
        if (num <= 0) {
            return false;
        }
        int sum = 0;
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                if (i * i != num) {
                    sum += num / i;
                }

            }
        }
        return sum - num == num;
    }
}
