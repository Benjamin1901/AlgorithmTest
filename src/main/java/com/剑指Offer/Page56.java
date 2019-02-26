package com.剑指Offer;

import java.util.ArrayList;

/**
 * @description: 从头到尾打印链表
 * @author: KimJun
 * @date: 19/1/20 20:57
 */
public class Page56 {

    ArrayList<Integer> list  = new ArrayList();
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if (listNode != null) {
            printListFromTailToHead(listNode.next);
            list.add(listNode.val);
        }
        return list;
    }

}


class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val)    {
        this.val = val;
    }
}

