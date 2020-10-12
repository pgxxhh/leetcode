package com.leetcode.coding.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * created by yangpeng on 2020/10/12
 * Given a binary tree, return all root-to-leaf paths.
 *
 * Note: A leaf is a node with no children.
 *
 * Example:
 *
 * Input:
 *
 *    1
 *  /   \
 * 2     3
 *  \
 *   5
 *
 * Output: ["1->2->5", "1->3"]
 *
 * Explanation: All root-to-leaf paths are: 1->2->5, 1->3
 */
public class BinaryTreePaths {

	public static List<String> binaryTreePaths(TreeNode root) {
		List<String> results = new ArrayList<>();
		if (root == null) {
			return results;
		}

		helper(results, "", root);
		return results;
	}

	//dfs
	private static void helper(List<String> results, String path, TreeNode root) {
		if (root == null) {
			return;
		}

		//leaf node, add path to result
		if (root.left == null && root.right == null) {
			path += root.value;
			results.add(path);
			return;
		}

		helper(results, path+root.value+"->", root.left);
		helper(results, path+root.value+"->", root.right);
	}

}
