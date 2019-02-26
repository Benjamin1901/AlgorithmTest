package com.剑指Offer;

/**
 * @description: 二叉树的镜像
 * @author: KimJun
 * @date: 2/26/19 22:25
 */
public class Page159 {
    public void Mirror(TreeNode2 root) {
        if (root != null) {
            TreeNode2 left = root.left;
            root.left = root.right;
            root.right = left;

            if (root.left != null) {
                Mirror(root.left);
            }
            if (root.right != null) {
                Mirror(root.right);
            }
        }
    }
}
