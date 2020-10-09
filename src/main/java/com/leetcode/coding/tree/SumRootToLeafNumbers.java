package com.leetcode.coding.tree;

/**
 * created by yangpeng on 2020/10/9
 * Given a binary tree containing digits from 0-9 only, each root-to-leaf path could represent a number.
 *
 * An example is the root-to-leaf path 1->2->3 which represents the number 123.
 *
 * Find the total sum of all root-to-leaf numbers.
 *
 * Note: A leaf is a node with no children.
 * Input: [1,2,3]
 *     1
 *    / \
 *   2   3
 * Output: 25
 * Explanation:
 * The root-to-leaf path 1->2 represents the number 12.
 * The root-to-leaf path 1->3 represents the number 13.
 * Therefore, sum = 12 + 13 = 25.
 */
public class SumRootToLeafNumbers {
	private static int sum;

	public static int sumNumbers(TreeNode root) {
		subSumNumbers(root, 0);


		return sum;
	}

	public static void subSumNumbers(TreeNode root, int currentNum) {
		if (root == null) {
			return;
		}

		currentNum = currentNum*10 + root.value;
		if (root.left != null || root.right != null) {
			subSumNumbers(root.left, currentNum);
			subSumNumbers(root.right, currentNum);
		} else {
			sum += currentNum;
		}
	}

}
