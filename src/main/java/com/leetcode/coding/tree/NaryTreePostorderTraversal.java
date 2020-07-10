package com.leetcode.coding.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class NaryTreePostorderTraversal {

    public static List<Integer> postorder(NTreeNode root) {
        List<Integer> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Stack<NTreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            NTreeNode tmp = stack.pop();
            result.add(tmp.val);
            if (tmp.children == null) {
                continue;
            }
            for(NTreeNode nTreeNode : tmp.children) {
                stack.push(nTreeNode);
            }
        }

        Collections.reverse(result);

        return result;
    }

    public static List<Integer> postOrderRecursive(NTreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        return postOrderRecursive(root, result);
    }

    private static List<Integer> postOrderRecursive(NTreeNode root, List<Integer> result) {
        if (root.children != null) {
            for (NTreeNode child : root.children) {
                postOrderRecursive(child, result);
            }
        }

        result.add(root.val);
        return result;
    }
}
