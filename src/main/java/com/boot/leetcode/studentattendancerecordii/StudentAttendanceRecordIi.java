package com.boot.leetcode.studentattendancerecordii;

/**
 * @PackageName: com.boot.leetcode.studentattendancerecordii
 * @ClassName: StudentAttendanceRecordIi
 * @Description: This is StudentAttendanceRecordIi class by Skwen.
 * @Author: Skwen
 * @Date: 2021-05-18 3:25
 */
public class StudentAttendanceRecordIi {
    static int  count,M=1000000007;
    public static void main(String[] args) {
        System.out.println(checkRecord(2));
    }

        public static int checkRecord(int n) {
            count = 0;
            gen("", n);
            return count;
        }
        public static void gen(String s, int n) {
            if (n == 0 && checkRecord(s)) {
                count=(count+1)%M;
            } else if (n > 0) {
                gen(s + "A", n - 1);
                gen(s + "P", n - 1);
                gen(s + "L", n - 1);
            }
        }
        public static boolean checkRecord(String s) {
            int count = 0;
            for (int i = 0; i < s.length() && count < 2; i++) {
                if (s.charAt(i) == 'A') {
                    count++;
                }
            }
            return s.length() > 0 && count < 2 && s.indexOf("LLL") < 0;
        }
}
