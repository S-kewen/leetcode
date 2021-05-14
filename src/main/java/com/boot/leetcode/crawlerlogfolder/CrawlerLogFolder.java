package com.boot.leetcode.crawlerlogfolder;

/**
 * @PackageName: com.boot.leetcode.crawlerlogfolder
 * @ClassName: CrawlerLogFolder
 * @Description: This is CrawlerLogFolder class by Skwen.
 * @Author: Skwen
 * @Date: 2021-05-15 1:59
 */
public class CrawlerLogFolder {
    public static void main(String[] args) {
        System.out.println(minOperations(new String[]{"d1/","d2/","../","d21/","./"}));
    }

    public static int minOperations(String[] logs) {
        int ans = 0;
        for (int i = 0; i < logs.length; i++) {
            if (logs[i].equals("../")) {
                ans = Math.max(0, ans - 1);
            } else if (!logs[i].equals("./")) {
                ans++;
            }
        }
        return ans;
    }
}
