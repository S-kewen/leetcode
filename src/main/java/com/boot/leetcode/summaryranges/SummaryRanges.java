package com.boot.leetcode.summaryranges;

import java.util.ArrayList;
import java.util.List;

/**
 * @PackageName: com.boot.leetcode.summaryranges
 * @ClassName: SummaryRanges
 * @Description: This is SummaryRanges class by Skwen.
 * @Author: Skwen
 * @Date: 2021-06-04 1:07
 */
public class SummaryRanges {
    public static void main(String[] args) {
        System.out.println(summaryRanges(new int[]{0,1,2,4,5,7}));
    }

    public static List<String> summaryRanges(int[] nums) {
        List<String> ret = new ArrayList<String>();
        int i = 0;
        int n = nums.length;
        while (i < n) {
            int low = i;
            i++;
            while (i < n && nums[i] == nums[i - 1] + 1) {
                i++;
            }
            int high = i - 1;
            StringBuffer temp = new StringBuffer(Integer.toString(nums[low]));
            if (low < high) {
                temp.append("->");
                temp.append(Integer.toString(nums[high]));
            }
            ret.add(temp.toString());
        }
        return ret;
    }
}
