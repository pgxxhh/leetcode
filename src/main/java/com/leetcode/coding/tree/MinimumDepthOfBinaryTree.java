package com.leetcode.coding.tree;

public class MinimumDepthOfBinaryTree {

    public static int minDepth(TreeNode root) {
        //注意[1,2] 这种测试用例
//        if (root == null) {
//            return 0;
//        }
//
//        int leftMinDepth = minDepth(root.left);
//        int rightMinDepth = minDepth(root.right);
//        return Math.min(leftMinDepth, rightMinDepth) + 1;

        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;
        int l = root.left != null ? minDepth(root.left) : Integer.MAX_VALUE;
        int r = root.right != null ? minDepth(root.right) : Integer.MAX_VALUE;

        return Math.min(l, r) + 1;
    }

    public static void main(String[] args) {
        System.out.println(Math.min(5,5));
    }
}
