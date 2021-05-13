package com.boot.leetcode.uniquenumberofoccurrences;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @PackageName: com.boot.leetcode.uniquenumberofoccurrences
 * @ClassName: UniqueNumberOfOccurrences
 * @Description: This is UniqueNumberOfOccurrences class by Skwen.
 * @Author: Skwen
 * @Date: 2021-05-14 1:21
 */
public class UniqueNumberOfOccurrences {
    public static void main(String[] args) {
        System.out.println(uniqueOccurrences(new int[]{1,2,2,1,1,3}));
    }

    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> occur = new HashMap<Integer, Integer>();
        for (int x : arr) {
            occur.put(x, occur.getOrDefault(x, 0) + 1);
        }
        Set<Integer> times = new HashSet<Integer>();
        for (Map.Entry<Integer, Integer> x : occur.entrySet()) {
            times.add(x.getValue());
        }
        return times.size() == occur.size();
    }
}
