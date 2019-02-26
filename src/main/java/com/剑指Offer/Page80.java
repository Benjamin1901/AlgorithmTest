package com.剑指Offer;

/**
 * @description: 矩形覆盖
 * @author: KimJun
 * @date: 19/1/22 11:06
 */
public class Page80 {
    public int RectCover(int target) {
        if (target == 0) {
            return 0;
        }
        if (target == 1) {
            return 1;
        }
        if (target == 2) {
            return 2;
        }

        int one = 1;
        int two = 2;
        int result = 0;
        if(target > 2) {
            for (int i = 2; i < target; i++) {
                result = one + two;
                one = two;
                two = result;
            }
        }
        return result;
    }

    public static void main(String[] args) {
     Page80 page80 = new Page80();
     System.out.println(page80.RectCover(4));
    }
}
