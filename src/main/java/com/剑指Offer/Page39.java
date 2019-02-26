package com.剑指Offer;

/**
 * @description: TODO
 * @author: KimJun
 * @date: 19/1/19 19:52
 */
public class Page39 {

    public static void check(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            //如果i与arr[i]不等
            while (i != arr[i] ) {
                if (arr[i] == arr[arr[i]]) {
                    System.out.println("重复的数是" + arr[i]);
                    break;
                }
                //交换数
                System.out.println("交换数据中....");
                int temp = arr[i];
                arr[i] = arr[temp];
                arr[temp] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 0, 0, 1};
        check(arr);
    }
}
