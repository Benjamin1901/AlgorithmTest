package com.剑指Offer;

/**
 * @description: 斐波那契数列
 * @author: KimJun
 * @date: 19/1/21 23:54
 */
public class Page75 {

    public int Fibonacci(int n) {
        int num = 1;
        int numPre = 0;
        int result = 0;
        if (n == 0) {
            return numPre;
        }
        if (n == 1) {
            return num;
        }
        if (n > 1) {
           for (int i =2; i <= n; i++) {
               result = num + numPre;
               numPre = num;
               num = result;
           }
        }
        return result;
    }

    public static void main(String[] args) {
        Page75 page75 = new Page75();
        System.out.println(page75.Fibonacci(2));
    }
}
