package com.boot.leetcode.walkingrobotsimulation;

import java.util.HashSet;
import java.util.Set;

/**
 * @PackageName: com.boot.leetcode.walkingrobotsimulation
 * @ClassName: WalkingRobotSimulation
 * @Description: This is WalkingRobotSimulation class by Skwen.
 * @Author: Skwen
 * @Date: 2021-06-17 2:26
 */
public class WalkingRobotSimulation {
    public static void main(String[] args) {
        System.out.println(robotSim(new int[]{4, -1, 3}, new int[][]{}));
    }

    public static int robotSim(int[] commands, int[][] obstacles) {
        int[] dx = new int[]{0, 1, 0, -1};
        int[] dy = new int[]{1, 0, -1, 0};
        int x = 0, y = 0, di = 0;

        // Encode obstacles (x, y) as (x+30000) * (2^16) + (y+30000)
        Set<Long> obstacleSet = new HashSet();
        for (int[] obstacle : obstacles) {
            long ox = (long) obstacle[0] + 30000;
            long oy = (long) obstacle[1] + 30000;
            obstacleSet.add((ox << 16) + oy);
        }

        int ans = 0;
        for (int cmd : commands) {
            if (cmd == -2)  //left
            {
                di = (di + 3) % 4;
            } else if (cmd == -1)  //right
            {
                di = (di + 1) % 4;
            } else {
                for (int k = 0; k < cmd; ++k) {
                    int nx = x + dx[di];
                    int ny = y + dy[di];
                    long code = (((long) nx + 30000) << 16) + ((long) ny + 30000);
                    if (!obstacleSet.contains(code)) {
                        x = nx;
                        y = ny;
                        ans = Math.max(ans, x * x + y * y);
                    }
                }
            }
        }

        return ans;
    }

}
