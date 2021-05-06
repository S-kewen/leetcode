package com.boot.leetcode.corporateflightbookings;

/**
 * @PackageName: com.boot.leetcode.corporateflightbookings
 * @ClassName: CorporateFlightBookings
 * @Description: This is CorporateFlightBookings class by Skwen.
 * @Author: Skwen
 * @Date: 2021-05-07 2:52
 */
public class CorporateFlightBookings {
    public static void main(String[] args) {
        int[][] bookings = {{1, 2, 10}, {2, 3, 20}, {2, 5, 25}};
        int[] result = corpFlightBookings(bookings, 5);
        for (int i : result) {
            System.out.println(i);
        }

    }

    public static int[] corpFlightBookings(int[][] bookings, int n) {
        int[] counters = new int[n];
        for (int[] booking : bookings) {
            counters[booking[0] - 1] += booking[2];
            if (booking[1] < n) {
                counters[booking[1]] -= booking[2];
            }
        }
        for (int i = 1; i < n; ++i) {
            counters[i] += counters[i - 1];
        }
        return counters;
    }
}
