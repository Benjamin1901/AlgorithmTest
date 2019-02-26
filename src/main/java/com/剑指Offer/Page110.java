package com.剑指Offer;

/**
 * @description：数值的整数次方
 * @author: KimJun
 * @date: 2/25/19 23:01
 */
public class Page110 {
    public double Power(double base, int exponent) {
        double result = 1;
        if (exponent == 0)
            return 1;
        else if (exponent == 1)
            return base;
        else if (exponent < 0 ) {
            for (int i = 1; i <= -exponent; i++) {
                result *= base;
            }
            return 1/result;
        }
        else {
            result = Power(base, exponent >> 1);
            result *= result;
            if ((exponent & 0x1) == 1)
                result *= base;
            return result;
        }
    }

    public static void main(String[] args) {
        Page110 p = new Page110();
        System.out.println(p.Power(2, -2    ));
    }
}
