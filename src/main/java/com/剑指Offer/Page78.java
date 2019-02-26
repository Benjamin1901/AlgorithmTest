package com.剑指Offer;

/**
 * @description: 青蛙跳台阶
 * @author: KimJun
 * @date: 19/1/22 10:41
 */
public class Page78 {
    public int JumpFloor(int target) {
        if (target == 0) {
            return 0;
        }
        if (target == 1) {
            return 1;
        }
        if (target == 2) {
            return 2;
        }
        int firstNum = 1;
        int secNum = 2;
        int  result = 0;
        if (target > 2) {
           for (int i = 2; i < target; i++) {
               result = firstNum + secNum;
               firstNum = secNum;
               secNum = result;
           }
        }
        return result;
    }

    public static void main(String[] args) {
        Page78 page78 = new Page78();
        System.out.println(page78.JumpFloor(3));
    }
}
