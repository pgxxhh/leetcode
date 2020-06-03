package com.leetcode.coding.tree;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePreorderTraversal {

    public static List<Integer> binaryTreePreorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);

        while (!stack.isEmpty()) {
            result.add(stack.peek().value);
            TreeNode tmp = stack.pop();
            if (tmp.right != null) {
                stack.add(tmp.right);
            }
            if (tmp.left != null) {
                stack.add(tmp.left);
            }
        }

        return result;
    }


}
