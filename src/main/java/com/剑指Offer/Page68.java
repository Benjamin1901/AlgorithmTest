package com.剑指Offer;

import java.util.Stack;

/**
 * @description: TODO
 * @author: KimJun
 * @date: 19/1/21 22:44
 */
public class Page68 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.add(node);
    }

    public int pop() {
        if (stack2.size() == 0) {
            while (stack1.size() != 0) {
                stack2.push(stack1.pop());
            }
            return  stack2.pop();
        }else {
            stack1.push(stack2.pop());
            return stack1.pop();
        }
    }
}
