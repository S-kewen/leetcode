package com.boot.leetcode.onlineelection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @PackageName: com.boot.leetcode.onlineelection
 * @ClassName: OnlineElection
 * @Description: This is OnlineElection class by Skwen.
 * @Author: Skwen
 * @Date: 2021-05-19 23:02
 */
public class OnlineElection {
    static List<List<Vote>> A;

    public static void main(String[] args) {
        TopVotedCandidate(new int[]{0, 1, 1, 0, 0, 1, 0}, new int[]{
                0, 5, 10, 15, 20, 25, 30
        });
    }

    public static void TopVotedCandidate(int[] persons, int[] times) {
        A = new ArrayList();
        Map<Integer, Integer> count = new HashMap();
        for (int i = 0; i < persons.length; ++i) {
            int p = persons[i], t = times[i];
            int c = count.getOrDefault(p, 0) + 1;

            count.put(p, c);
            while (A.size() <= c) {
                A.add(new ArrayList<Vote>());
            }
            A.get(c).add(new Vote(p, t));
        }
    }

    public static int q(int t) {
        int lo = 1, hi = A.size();
        while (lo < hi) {
            int mi = lo + (hi - lo) / 2;
            if (A.get(mi).get(0).time <= t) {
                lo = mi + 1;
            } else {
                hi = mi;
            }
        }
        int i = lo - 1;

        // Binary search on A[i][j].time for smallest j
        // such that A[i][j].time > t
        lo = 0;
        hi = A.get(i).size();
        while (lo < hi) {
            int mi = lo + (hi - lo) / 2;
            if (A.get(i).get(mi).time <= t) {
                lo = mi + 1;
            } else {
                hi = mi;
            }
        }
        int j = Math.max(lo - 1, 0);
        return A.get(i).get(j).person;
    }

    static class Vote {
        int person, time;

        Vote(int p, int t) {
            person = p;
            time = t;
            System.out.println(p);
            System.out.println(t);
        }
    }
}
