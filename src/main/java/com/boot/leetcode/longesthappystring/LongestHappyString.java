package com.boot.leetcode.longesthappystring;

/**
 * @PackageName: com.boot.leetcode.longesthappystring
 * @ClassName: LongestHappyString
 * @Description: This is LongestHappyString class by Skwen.
 * @Author: Skwen
 * @Date: 2021-05-08 20:18
 */
public class LongestHappyString {
    public static void main(String[] args) {
        System.out.println(longestDiverseString(1,1,7));
    }
    static private int[] char2num;

    private static char nextChar(char exclude) {
        char next;
        if (exclude == 'a') {
            next = char2num[1] > char2num[2] ? 'b' : 'c';
        } else if (exclude == 'b') {
            next = char2num[0] > char2num[2] ? 'a' : 'c';
        } else if (exclude == 'c') {
            next = char2num[0] > char2num[1] ? 'a' : 'b';
        } else {
            next = char2num[0] > char2num[1] ? 'a' : 'b';
            next = char2num[next - 'a'] > char2num[2] ? next : 'c';
        }
        return next;
    }

    public static String longestDiverseString(int a, int b, int c) {
        char2num = new int[]{a, b, c};

        char[] result = new char[a + b + c];
        int idx = 0;

        while (char2num[0] != 0 || char2num[1] != 0 || char2num[2] != 0) {
            char next;
            if (idx < 2 || result[idx - 1] != result[idx - 2]) {
                next = nextChar(' ');
            } else {
                next = nextChar(result[idx - 1]);
            }
            if (char2num[next - 'a'] <= 0) {
                break;
            }
            --char2num[next - 'a'];
            result[idx++] = next;
        }

        return new String(result, 0, idx);
    }
}
