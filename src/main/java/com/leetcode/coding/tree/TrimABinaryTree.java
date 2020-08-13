package com.leetcode.coding.tree;

/**
 * created by yangpeng on 2020/8/13
 */
public class TrimABinaryTree {

	public static TreeNode trimBST(TreeNode root, int L, int R) {
		if (root == null) {
			return null;
		}

		if (root.value < L) {
			return trimBST(root.right, L, R);
		}
		if (root.value > R) {
			return trimBST(root.left, L, R);
		}

		root.left = trimBST(root.left, L, R);
		root.right = trimBST(root.right, L, R);
		return root;
	}
}
