package com.剑指Offer;

/**
 * @description: 左旋字符串
 * @author: KimJun
 * @date: 3/14/19 18:09
 */
public class Page286 {

    public String LeftRotateString(String str, int n) {
        if (str == "" || str.length() == 0) {
            return null;
        }

        String sub = str.substring(n);
        String subs = str.substring(0, n);
        return sub + subs;
    }

    public static void main(String[] args) {
        Page286 page286 = new Page286();
        System.out.println(page286.LeftRotateString("1234567", 3));
    }
}
