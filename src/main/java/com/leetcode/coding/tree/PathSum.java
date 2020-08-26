package com.leetcode.coding.tree;

/**
 * created by yangpeng on 2020/8/26
 * Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.
 *
 * Note: A leaf is a node with no children.
 * 112
 */
public class PathSum {


	public static boolean hasPathSum(TreeNode root, int sum) {
		if (root == null) {
			return false;
		}

		if (root.left == null && root.right == null && root.value == sum) {
			return true;
		}

		sum = sum-root.value;

		return hasPathSum(root.left, sum) || hasPathSum(root.right, sum);
	}


}
