package com.boot.leetcode.jewelsandstones;

/**
 * @PackageName: com.boot.leetcode.jewelsandstones
 * @ClassName: JewelsAndStones
 * @Description: This is JewelsAndStones class by Skwen.
 * @Author: Skwen
 * @Date: 2021-05-31 2:03
 */
public class JewelsAndStones {
    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA", "aAAbbbb"));
    }

    public static int numJewelsInStones(String jewels, String stones) {
        int jewelsCount = 0;
        int jewelsLength = jewels.length(), stonesLength = stones.length();
        for (int i = 0; i < stonesLength; i++) {
            char stone = stones.charAt(i);
            for (int j = 0; j < jewelsLength; j++) {
                char jewel = jewels.charAt(j);
                if (stone == jewel) {
                    jewelsCount++;
                    break;
                }
            }
        }
        return jewelsCount;
    }
}
