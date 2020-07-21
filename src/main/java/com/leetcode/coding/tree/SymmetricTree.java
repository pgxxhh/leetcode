package com.leetcode.coding.tree;

/**
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
 *     1
 *    / \
 *   2   2
 *  / \ / \
 * 3  4 4  3
 */
public class SymmetricTree {

    public static boolean isSymmetric(TreeNode root) {
        return isSymmetric(root, root);
    }

    private static boolean isSymmetric(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return true;
        }

        if (root1 == null || root2 == null) {
            return false;
        }

        return root1.value == root2.value && isSymmetric(root1.left, root2.right) && isSymmetric(root1.right, root2.left);
    }

}
