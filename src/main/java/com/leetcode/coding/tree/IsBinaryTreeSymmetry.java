package com.leetcode.coding.tree;
import com.leetcode.coding.tree.TreeNode;
public class IsBinaryTreeSymmetry {
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
