package com.leetcode.coding.tree;

/**
 * We are given the head node root of a binary tree, where additionally every node's value is either a 0 or a 1.
 *
 * Return the same tree where every subtree (of the given tree) not containing a 1 has been removed.
 *
 * (Recall that the subtree of a node X is X, plus every node that is a descendant of X.)
 */
public class BinaryTreePruning {
	private static final String HAHA = "haha";
	public String test = HAHA;

	public static TreeNode pruneTree(TreeNode root) {
		if (root == null) {
			return root;
		}

		root.left = pruneTree(root.left);
		root.right = pruneTree(root.right);
		return root.value == 1 || root.left != null || root.right != null ? root : null;
	}


}
