package com.leetcode.coding.tree;

/**
 * created by yangpeng on 2020/10/14
 * Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST.
 *
 * According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself).”
 *
 *
 *
 * Example 1:
 *
 *
 * Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8
 * Output: 6
 * Explanation: The LCA of nodes 2 and 8 is 6.
 */
public class LowestCommonAncestorOfABinarySearchTree {

	public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if (root == null) {
			return null;
		}


		if (root.value > p.value && root.value > q.value) {
			return lowestCommonAncestor(root.left, p, q);
		}else if(root.value < p.value && root.value < q.value) {
			return lowestCommonAncestor(root.right, p, q);
		}

		return  root;
	}

}
