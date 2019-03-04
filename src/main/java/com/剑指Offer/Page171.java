package com.剑指Offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @description: 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 * @author: KimJun
 * @date: 2/27/19 15:03
 */
public class Page171 {

    public ArrayList<Integer> PrintFromTopToBottom(TreeNode2 root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null)
            return list;

        //辅助队列
        Queue<TreeNode2> queue = new LinkedList<>();
        //头结点
        queue.offer(root);

        while (!queue.isEmpty()) {

            //队列第一个出队
            TreeNode2 node = queue.poll();
            if (node.left != null)
                queue.offer(node.left);

            if (node.right != null)
                queue.offer(node.right);

            list.add(node.val);
        }
        return list;
    }
}
