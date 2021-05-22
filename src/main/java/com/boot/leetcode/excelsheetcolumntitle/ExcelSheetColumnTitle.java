package com.boot.leetcode.excelsheetcolumntitle;

/**
 * @PackageName: com.boot.leetcode.excelsheetcolumntitle
 * @ClassName: ExcelSheetColumnTitle
 * @Description: This is ExcelSheetColumnTitle class by Skwen.
 * @Author: Skwen
 * @Date: 2021-05-23 3:15
 */
public class ExcelSheetColumnTitle {
    public static void main(String[] args) {
        System.out.println(convertToTitle(28));
    }

    public static String convertToTitle(int columnNumber) {
        StringBuffer buffer = new StringBuffer();
        while (columnNumber != 0) {
            int remainder = columnNumber % 26 == 0 ? 26 : columnNumber % 26;
            char res = (char) (64 + remainder);
            buffer.insert(0, res);
            columnNumber = (columnNumber - remainder) / 26;
        }
        return buffer.toString();
    }

}
