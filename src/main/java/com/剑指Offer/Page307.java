package com.剑指Offer;

/**
 * @description: 求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字
 * 及条件判断语句（A?B:C）
 * @author: KimJun
 * @date: 3/14/19 18:42
 */
public class Page307 {
    public int Sum_Solution(int n) {
        int num = (int) (Math.pow(n,2) + n);
        return num >> 1;

    }

    public static void main(String[] args) {
        Page307 page307 = new Page307();
        System.out.println(page307.Sum_Solution(100));
    }
}
