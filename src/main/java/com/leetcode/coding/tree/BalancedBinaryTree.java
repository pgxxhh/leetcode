package com.leetcode.coding.tree;

public class BalancedBinaryTree {

    private boolean balanced;

    /**
     * O(logN)
     * @param root
     * @return
     */
    public static boolean isBalanced(TreeNode root) {
        if (root == null) {
            return  true;
        }

        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return Math.abs(leftDepth-rightDepth) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }

    private static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }


    /************************************** O(logN)*****************************************/
    private int height(TreeNode root, boolean balanced) {
        if (root == null || !balanced) return -1;
        int l = height(root.left, balanced);
        int r = height(root.right, balanced);
        if (Math.abs(l - r) > 1) {
            balanced = false;
            return -1;
        }
        return Math.max(l, r) + 1;
    }

    public boolean isBalancedEffective(TreeNode root) {
        boolean balanced = true;
        height(root, balanced);
        return balanced;
    }
}
