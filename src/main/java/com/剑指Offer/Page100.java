package com.剑指Offer;

/**
 * @description: 二进制中的1个数
 * @author: KimJun
 * @date: 2/25/19 19:52
 */
public class Page100 {
        //负值是出现错误
//    public int NumberOf1(int n) {
//        int count = 0;
//        while (n != 0) {
//            if ((n & 1) == 1) {
//                count++;
//            }
//            n = n >> 1;
//        }
//        return count;
//    }

    public int NumberOf1(int n) {
        int count = 0;
        while (n != 0) {
            ++count;
            n = n & (n -1);
        }
        return count;
    }

    public static void main(String[] args) {
        Page100 p = new Page100();
     System.out.println(p.NumberOf1(100));
    }
}
