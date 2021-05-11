package com.boot.leetcode.carfleet;

import java.util.Arrays;

/**
 * @PackageName: com.boot.leetcode.carfleet
 * @ClassName: CarFleet
 * @Description: This is CarFleet class by Skwen.
 * @Author: Skwen
 * @Date: 2021-05-12 0:06
 */
public class CarFleet {
    static class Car {
        int position;
        double time;

        Car(int p, double t) {
            position = p;
            time = t;
        }
    }

    public static void main(String[] args) {
        System.out.println(carFleet(12, new int[]{10, 8, 0, 5, 3}, new int[]{2, 4, 1, 1, 3}));
    }

    public static int carFleet(int target, int[] position, int[] speed) {
        int N = position.length;
        Car[] cars = new Car[N];
        for (int i = 0; i < N; ++i) {
            cars[i] = new Car(position[i], (double) (target - position[i]) / speed[i]);
        }
        Arrays.sort(cars, (a, b) -> Integer.compare(a.position, b.position));

        int ans = 0, t = N;
        while (--t > 0) {
            if (cars[t].time < cars[t - 1].time) {
                ans++; //if cars[t] arrives sooner, it can't be caught
            } else {
                cars[t - 1] = cars[t]; //else, cars[t-1] arrives at same time as cars[t]
            }
        }

        return ans + (t == 0 ? 1 : 0); //lone car is fleet (if it exists)
    }


}
