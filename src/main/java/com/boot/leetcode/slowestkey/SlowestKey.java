package com.boot.leetcode.slowestkey;

/**
 * @PackageName: com.boot.leetcode.slowestkey
 * @ClassName: SlowestKey
 * @Description: This is SlowestKey class by Skwen.
 * @Author: Skwen
 * @Date: 2021-05-15 2:01
 */
public class SlowestKey {
    public static void main(String[] args) {
        System.out.println(fast_slowestKey(new int[]{9,29,49,50},"cbcd"));
    }

    public static char fast_slowestKey(int[] releaseTimes, String keysPressed) {
        //临时变量,记录每个字母的持续时间
        int temp = 0;
        //记录持续结果
        char result = keysPressed.charAt(0);
        //记录持续时间最大值
        int max = releaseTimes[0];
        for (int i = 1; i < releaseTimes.length; i++) {
            //每个字母的持续时间
            temp = releaseTimes[i] - releaseTimes[i - 1];
            //如果当前字母的持续时间大于max就进行更新操作
            if (temp > max) {
                max = temp;
                result = keysPressed.charAt(i);
            }
            //如果当前字母的持续时间等于max且当前字母大于result就更新
            if (temp == max && keysPressed.charAt(i) > result) {
                result = keysPressed.charAt(i);
            }
        }
        return result;
    }
}
