package com.leetcode.coding.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * created by yangpeng on 2020/9/3
 *
 * Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.
 *
 * Note: A leaf is a node with no children.
 *
 * Example:
 *
 * Given the below binary tree and sum = 22,
 *
 *       5
 *      / \
 *     4   8
 *    /   / \
 *   11  13  4
 *  /  \    / \
 * 7    2  5   1
 * Return:
 *
 * [
 *    [5,4,11,2],
 *    [5,8,4,5]
 * ]
 */
public class PathSumII {
	private static List<List<Integer>> result = new ArrayList<>();

	public static List<List<Integer>> pathSum(TreeNode root, int sum) {
		 pathSum(root, sum, new ArrayList<>());
		 return result;
	}

	private static void pathSum(TreeNode root, int sum, List<Integer> curPath) {
		if (root == null) {
			return;
		}

		if (root.left == null && root.right == null && root.value == sum) {
			List<Integer> tmp = new ArrayList<>(curPath);
			tmp.add(root.value);
			result.add(tmp);
		}

		curPath.add(root.value);
		int curSum = sum - root.value;
		pathSum(root.left, curSum, curPath);
		pathSum(root.right, curSum, curPath);
		curPath.remove(curPath.size()-1);
	}
}
