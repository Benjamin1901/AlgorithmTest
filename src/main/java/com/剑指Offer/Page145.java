package com.剑指Offer;

/**
 * @description: 合并两个排序的列表  按从小到大排序
 * @author: KimJun
 * @date: 2/26/19 17:08
 */
public class Page145 {

    public ListNode Merge(ListNode list1, ListNode list2) {
        if (list1 == null)
            return list2;
        else if (list2 == null)
            return list1;

        //新建一个listNode保存
        ListNode node = null;

        if (list1.val < list2.val) {
            node = list1;
            node.next = Merge(list1.next, list2);
        }else {
            node = list2;
            node.next = Merge(list1, list2.next);
        }

        return node;
    }
}
