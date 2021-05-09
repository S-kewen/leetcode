package com.boot.leetcode.alphabetboardpath;

/**
 * @PackageName: com.boot.leetcode.alphabetboardpath
 * @ClassName: AlphabetBoardPath
 * @Description: This is AlphabetBoardPath class by Skwen.
 * @Author: Skwen
 * @Date: 2021-05-09 20:44
 */
public class AlphabetBoardPath {
    public static void main(String[] args) {
        System.out.println(alphabetBoardPath("abcde"));
    }
    public static String alphabetBoardPath(String target) {
        // 起始点坐标x轴0，y轴0
        int startx = 0, starty = 0;
        char[] ch = target.toCharArray();
        int x, y;
        StringBuilder stb = new StringBuilder();
        for (char c : ch) {
            // 根据字符a计算当前字符的位置
            int cc = c - 97;
            // 当前字符x轴位置
            x = cc % 5;
            // 当前字符y轴位置
            y = cc / 5;
            int sx = x - startx;
            int sy = y - starty;
            // 起始点在z有独特性，先上后右
            if (starty == 5) {
                for (; sy < 0; sy++)
                    // 因为起点z，所以必定往上，sy小于等于0，85为U的ASCII码
                    stb.append((char) 85);
                for (; sx > 0; sx--)
                    // 同上，往右，82为R的ASCII码
                    stb.append((char) 82);
            }
            // 除z外，都是先左右在上下
            else {
                if (sx > 0) {
                    for (; sx > 0; sx--)
                        // 右
                        stb.append((char) 82);
                } else if (sx < 0) {
                    for (; sx < 0; sx++)
                        // 左
                        stb.append((char) 76);
                }
                if (sy > 0) {
                    for (; sy > 0; sy--)
                        // 下
                        stb.append((char) 68);
                } else if (sy < 0) {
                    for (; sy < 0; sy++)
                        // 上
                        stb.append((char) 85);
                }
            }
            // 指令'!'
            stb.append((char) 33);
            // 保存当前坐标
            startx = x;
            starty = y;
        }
        return stb.toString();
    }
}
