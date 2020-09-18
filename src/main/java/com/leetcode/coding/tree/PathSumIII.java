package com.leetcode.coding.tree;

/**
 * created by yangpeng on 2020/9/9
 */
public class PathSumIII {
	private static int count;

	private static int pathSum(TreeNode root, int sum) {
		if (root == null) return 0;
		return pathSumFrom(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);

	}

	private static int pathSumFrom(TreeNode node, int sum) {
		if (node == null) return 0;
		return (node.value == sum ? 1 : 0)
				+ pathSumFrom(node.left, sum - node.value) + pathSumFrom(node.right, sum - node.value);
	}
}
