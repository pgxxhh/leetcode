package com.leetcode.coding.tree;

public class SubtreeOfAnotherTree {

    public static boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null) {
            return false;
        }
        boolean result = isSameTree(s, t);
        if (!result) {
            result = isSubtree(s.left, t) || isSubtree(s.right, t);
        }
        return result;
    }

    private static boolean isSameTree(TreeNode s, TreeNode t) {
        if (s == null && t == null) { return true; }
        if (s == null || t == null) { return false; }

        if (s.value != t.value) {
            return false;
        }

        return isSameTree(s.left, t.left) && isSameTree(s.right, t.right);
    }
}
