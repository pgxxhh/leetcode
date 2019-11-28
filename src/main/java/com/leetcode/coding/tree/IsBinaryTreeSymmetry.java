package com.leetcode.coding.tree;

import sun.reflect.generics.tree.Tree;

public class IsBinaryTreeSymmetry {

    //二叉树是否对称
    public static class TreeNode {
        public int value;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int value, TreeNode left, TreeNode right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        public TreeNode(int value) { this.value = value; }
    }

    public static boolean isBinaryTreeSymmetry(TreeNode root) {
        if (root == null) {
            return true;
        }

        return isBinaryTreeSymmetry(root.left, root.right);
    }

    public static boolean isBinaryTreeSymmetry(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }

        if(left == null || right == null) {
            return false;
        }

       return left.value == right.value && isBinaryTreeSymmetry(left.left, right.right) && isBinaryTreeSymmetry(left.right, right.left);
    }
}
