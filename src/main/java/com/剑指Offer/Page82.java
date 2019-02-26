package com.剑指Offer;

/**
 * @description: 旋转数组中的最小数字
 * @author: KimJun
 * @date: 19/1/22 18:23
 */
public class Page82 {
    /**
     * 找出数组中的最小元素，利用的是二分查找法
     * @param array
     * @return
     */
    public int minNumberInRotateArray(int [] array) {
        if (array.length == 0) {
            return 0;
        }else {
            int index1 = 0;
            int index2 = array.length - 1;
            int indexMid = -1;
            while (array [index1] >= array[index2]) {
                if (index2 - index1 == 1) {
                    indexMid = index2;
                    break;
                }
                indexMid = index1 + (index2 - index1) / 2;
                if (array[indexMid] >= array[index1]) {
                    index1 = indexMid;
                }
                if (array[indexMid] <= array[index2]) {
                    index2 = indexMid;
                }
            }
        return array[indexMid];
        }
    }
}
