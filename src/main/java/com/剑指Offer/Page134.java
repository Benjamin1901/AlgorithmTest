package com.剑指Offer;

/**
 * @description: 链表中的倒数第k个节点
 * @author: KimJun
 * @date: 2/26/19 14:06
 */
public class Page134 {

    public ListNode FindKthToTail(ListNode head, int k) {
        if (head == null || k <= 0)
            return null;

        ListNode slow = head;
        ListNode fast = head;

        for (int i = 1; i < k; i++) {
            if (fast.next == null) {
                return null;
            }
            fast = fast.next;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;

    }
}


//class ListNode {
//    int val;
//    ListNode next = null;
//
//    ListNode(int val) {
//        this.val = val;
//    }
//}
