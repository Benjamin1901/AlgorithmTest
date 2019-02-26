package com.剑指Offer;

/**
 * @description: 反转链表
 * @author: KimJun
 * @date: 2/26/19 15:19
 */
public class Page142 {

    public ListNode ReverseList(ListNode head) {
        //鲁棒性
        if (head == null) {
            return null;
        }

        //需要pre和next的目的是让当前节点从pre->head->next1->next2变成pre<-head next1->next2
        ListNode pre =null;
        ListNode next = null;

        while (head != null) {

            //先用next保存head的下一个节点的信息，保证单链表不会因为失去head节点的原next节点而就此断裂
            next = head.next;

            //断裂
            head.next = pre;

            //让pre，head，next依次向后移动一个节点，继续下一次的指针反转
            pre = head;
            head = next;
        }

        return pre;
    }
}
