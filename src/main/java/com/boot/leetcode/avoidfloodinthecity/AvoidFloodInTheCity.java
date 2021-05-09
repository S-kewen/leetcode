package com.boot.leetcode.avoidfloodinthecity;

import java.util.HashMap;
import java.util.Map;

/**
 * @PackageName: com.boot.leetcode.avoidfloodinthecity
 * @ClassName: AvoidFloodInTheCity
 * @Description: This is AvoidFloodInTheCity class by Skwen.
 * @Author: Skwen
 * @Date: 2021-05-09 20:41
 */
public class AvoidFloodInTheCity {
    public static void main(String[] args) {
        int [] result = avoidFlood(new int[]{1,2,3,4});
        for (int i : result){
            System.out.println(i);
        }
    }

    public static int[] avoidFlood(int[] rains) {
        int[] cnt = new int[rains.length];
        int index = 0;
        for (int i = 0; i < rains.length; i++) {
            if (rains[i] == 0) {
                cnt[index++] = i;
            }
        }
        int[] output = new int[rains.length];
        int curIndex = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < rains.length; i++) {
            if (rains[i] != 0) {
                output[i] = -1;
                if (map.containsKey(rains[i]) && map.get(rains[i]) < i) {
                    int small = map.get(rains[i]);
                    int j = curIndex;
                    while (j < index) {
                        if (cnt[j] > small) {
                            break;
                        }
                        j++;
                    }
                    if (j >= index) {
                        return new int[0];
                    }
                    if (cnt[j] > i) {
                        return new int[0];
                    }
                    output[cnt[j]] = rains[i];
                    cnt[j] = -1;
                    if (j == curIndex) {
                        while (curIndex < index && cnt[curIndex] == -1) {
                            curIndex++;
                        }
                    }
                }
                map.put(rains[i], i);
            }
        }
        for (int i = 0; i < index; i++) {
            if (cnt[i] != -1) {
                output[cnt[i]] = 1;
            }
        }
        return output;
    }

}
