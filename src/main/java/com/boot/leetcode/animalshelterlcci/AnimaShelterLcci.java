package com.boot.leetcode.animalshelterlcci;

import java.util.LinkedList;

/**
 * @PackageName: com.boot.leetcode.animalshelterlcci
 * @ClassName: AnimaShelterLcci
 * @Description: This is AnimaShelterLcci class by Skwen.
 * @Author: Skwen
 * @Date: 2021-06-01 4:35
 */
public class AnimaShelterLcci {
    LinkedList<int[]> linkedList = new LinkedList<>();


    public void enqueue(int[] animal) {
        linkedList.add(animal);
    }

    public int[] dequeueAny() {
        if (linkedList.size() != 0) {
            int[] temp = linkedList.getFirst();
            linkedList.remove(linkedList.indexOf(temp));
            return temp;
        }
        return new int[]{-1, -1};
    }

    public int[] dequeueDog() {
        for (int i = 0; i < linkedList.size(); i++) {
            int[] temp = linkedList.get(i);
            if (temp[1] == 1) {
                linkedList.remove(linkedList.indexOf(temp));
                return temp;
            }
        }
        return new int[]{-1, -1};
    }

    public int[] dequeueCat() {
        for (int i = 0; i < linkedList.size(); i++) {
            int[] temp = linkedList.get(i);
            if (temp[1] == 0) {
                linkedList.remove(linkedList.indexOf(temp));
                return temp;
            }
        }
        return new int[]{-1, -1};
    }
}
