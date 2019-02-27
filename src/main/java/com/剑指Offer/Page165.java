package com.剑指Offer;

import java.util.Stack;

/**
 * @description: 包含min函数的栈
 * @author: KimJun
 * @date: 2/27/19 13:50
 */
public class Page165 {

    Stack<Integer> minStack = new Stack<>();
    Stack<Integer> norStack = new Stack<>();

    public void push(int node) {
        if (norStack.empty()) {
            minStack.add(node);
            norStack.add(node);
        }else {
            //如果元素小于栈顶的元素
            if (node < minStack.peek()) {
                minStack.add(node);
            }else {
                minStack.add(minStack.peek());
            }
            norStack.add(node);
        }
    }

    public void pop() {
        minStack.pop();
        norStack.pop();
    }

    public int top() {
        return norStack.peek();
    }

    public int min() {
        return minStack.peek();
    }
}
