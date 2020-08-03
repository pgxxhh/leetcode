package com.leetcode.coding.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Given a binary tree, return the bottom-up level order traversal of its nodes’ values. (ie, from left to right, level by level from leaf to root).
 *
 * For example:
 * Given binary tree [3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * return its bottom-up level order traversal as:
 *
 * [
 *   [15,7],
 *   [9,20],
 *   [3]
 * ]
 */
public class BinaryTreeLevelOrderTraversalII {

    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> answer = new ArrayList<>();
        dFS(root, 0, answer);
        Collections.reverse(answer);
        return answer;
    }

    private static void dFS(TreeNode root, int depth, List<List<Integer>> answer) {
        if (root == null) {
            return;
        }

        if (answer.size() <= depth) {
            answer.add(new ArrayList<>());
        }

        answer.get(depth).add(root.value);

        dFS(root.left, depth+1, answer);
        dFS(root.right, depth+1, answer);
    }
}
