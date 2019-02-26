package com.剑指Offer;

import java.util.Arrays;

/**
 * @description: 调整数组顺序使奇数位于偶数前面
 * @author: KimJun
 * @date: 2/25/19 23:50
 */
public class Page129 {
    public void reOrderArray(int [] array) {
        if (array.length == 0 || array.length == 1)
            return;
        int[] arr = new int[array.length];
        int beign = 0;

        for (int i = 0; i < array.length; i++) {
            //奇数
            if ((array[i] & 1) == 1) {
                arr[beign++] = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            //偶数
            if ((array[i] & 1) == 0) {
                arr[beign++] = array[i];
            }
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = arr[i];
        }

        System.out.println(Arrays.toString(array));
    }


    public static void main(String[] args) {
        int[] array =  {1,2,3,4,5,6,7,8,9,10};
        Page129 p = new Page129();
        p.reOrderArray(array);
    }
}
