package com.boot.leetcode.base7;

/**
 * @PackageName: com.boot.leetcode.base7
 * @ClassName: Base7
 * @Description: This is Base7 class by Skwen.
 * @Author: Skwen
 * @Date: 2021-05-04 3:52
 */
public class Base7 {
    public static void main(String[] args) {
        System.out.println(convertToBase7(1222));
    }

    public static String convertToBase7(int num) {

        StringBuilder sb = new StringBuilder();
        //判断零
        if (num == 0) {
            sb.append("0");
            return sb.toString();
        }
        boolean flag = false;
        //判断是否小于零，将小于零的数，转换成大于零的数，统一处理
        if (num < 0) {
            num = -num;
            flag = true;
        }
        // 求进制的模板，转换成几进制，就先求余几，然后再除以几
        while (num != 0) {
            sb.append(num % 7);
            num /= 7;
        }
        // 逆序
        sb.reverse();
        if (flag) {
            sb.insert(0, "-");
        }
        return sb.toString();
    }
}
