package com.leetcode.coding.tree;

import java.util.*;

public class NaryTreePreorderTraversal {

    public static List<Integer> preorderIterative(NTreeNode root) {
        if (root == null) {
            return Collections.EMPTY_LIST;
        }

        List<Integer> answer = new ArrayList<>();
        Stack<NTreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            NTreeNode tmp = stack.peek();
            stack.pop();
            answer.add(tmp.val);

            if (tmp.children != null) {
                for (int i = tmp.children.size()-1; i>=0; i--) {
                    stack.add(tmp.children.get(i));
                }
            }
        }

        return answer;
    }

    public static List<Integer> preorderRecursive(NTreeNode root) {
        if (root == null) {
            return Collections.EMPTY_LIST;
        }

        List<Integer> answer = new ArrayList<>();
        preorderRecursive(root, answer);

        return answer;
    }

    private static void preorderRecursive(NTreeNode root, List<Integer> answer) {
        answer.add(root.val);
        if (root.children != null) {
            for (NTreeNode child : root.children) {
                preorderRecursive(child, answer);
            }
        }
    }
}
