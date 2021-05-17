package com.boot.leetcode.studentattendancerecordi;

/**
 * @PackageName: com.boot.leetcode.studentattendancerecordi
 * @ClassName: StudentAttendanceRecordI
 * @Description: This is StudentAttendanceRecordI class by Skwen.
 * @Author: Skwen
 * @Date: 2021-05-18 3:23
 */
public class StudentAttendanceRecordI {
    public static void main(String[] args) {
        System.out.println(checkRecord("PPALLP"));
    }

    public static boolean checkRecord(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                count++;
            }
        }
        return count < 2 && s.indexOf("LLL") < 0;
    }
}
