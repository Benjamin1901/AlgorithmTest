package com.剑指Offer;

import java.util.Stack;

/**
 * @description: 栈的压入、弹出序列
 * @author: KimJun
 * @date: 2/27/19 14:15
 */
public class Page168 {

    public boolean IsPopOrder(int [] pushA,int [] popA) {
        if(pushA.length == 0 || popA.length ==0)
            return false;

        Stack<Integer> stack = new Stack<>();
        //标记
        int temp = 0;

        for (int i = 0; i <= pushA.length; i++) {
            stack.push(pushA[i]);

            //如果辅助栈不为空 同时辅助栈的栈顶元素等于出栈的元素
            while (!stack.empty() && stack.peek() == popA[temp]) {
                //辅助栈出栈
                stack.pop();

                //标记位+1
                temp++;
            }
        }
        return stack.empty();
    }
}
