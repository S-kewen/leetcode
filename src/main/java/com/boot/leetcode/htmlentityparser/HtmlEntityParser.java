package com.boot.leetcode.htmlentityparser;

/**
 * @PackageName: com.boot.leetcode.htmlentityparser
 * @ClassName: HtmlEntityParser
 * @Description: This is HtmlEntityParser class by Skwen.
 * @Author: Skwen
 * @Date: 2021-05-05 15:19
 */
public class HtmlEntityParser {
    public static void main(String[] args) {
        System.out.println(entityParser("&amp; is an HTML entity but &ambassador; is not."));
    }
    public static String entityParser(String text) {
        return text.replace("&quot;", "\"").replace("&apos;", "'").replace("&gt;", ">").replace("&lt;", "<").replace("&frasl;", "/").replace("&amp;", "&");
    }

}
