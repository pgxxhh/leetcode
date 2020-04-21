package com.leetcode.coding.tree;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        TreeNode tmp = root;
        Stack<TreeNode> stack = new Stack<>();

       while (tmp != null || !stack.isEmpty()) {
           while (tmp != null) {
               stack.push(tmp);
               tmp = tmp.left;
           }

           tmp = stack.peek();
           stack.pop();
           result.add(tmp.value);

           tmp = tmp.right;
       }
        return result;
    }
}
