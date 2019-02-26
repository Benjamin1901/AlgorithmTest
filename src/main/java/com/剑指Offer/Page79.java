package com.剑指Offer;

/**
 * @description: 变态跳阶梯
 * @author: KimJun
 * @date: 19/1/22 10:53
 */
public class Page79 {
    public int JumpFloorII(int target) {
        if (target == 0) {
            return 0;
        } else{
            return (int) Math.pow(2,target - 1);
        }
    }

    public static void main(String[] args) {
        Page79 page79 = new Page79();
        System.out.println(page79.JumpFloorII(3));
    }
}
