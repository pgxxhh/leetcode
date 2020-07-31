package com.leetcode.coding.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
 *
 * For example:
 * Given binary tree [3,9,20,null,null,15,7],
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * return its level order traversal as:
 * [
 *   [3],
 *   [9,20],
 *   [15,7]
 * ]
 */
public class BinaryTreeLevelOrderTraversal {

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> answer = new ArrayList<>();
        return dFS(root, 0, answer);
    }

    private static List<List<Integer>> dFS(TreeNode root, int depth, List<List<Integer>> answer) {
        if (root == null) { return answer; }
        if (answer.size() <= depth) {
            answer.add(new ArrayList<>());
        }

        answer.get(depth).add(root.value);
        dFS(root.left, depth+1, answer);
        dFS(root.right, depth+1, answer);
        return answer;
    }

    //todo
    private static List<List<Integer>> bFS(TreeNode root, int depth, List<List<Integer>> answer) {
       return null;
    }
}
