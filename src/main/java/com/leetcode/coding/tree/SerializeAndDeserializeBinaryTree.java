package com.leetcode.coding.tree;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * created by yangpeng on 2020/10/26
 * Example 1:
 *
 *       1
 *      / \
 *     2   3
 *        / \
 *       4   5
 * Input: root = [1,2,3,null,null,4,5]
 * Output: [1,2,3,null,null,4,5]
 */
public class SerializeAndDeserializeBinaryTree {
	private static final String SPLITER = ",";
	private static final String NULL_FLAG = "null";

	// Encodes a tree to a single string.
	public static String serialize(TreeNode root) {
		StringBuilder builder = new StringBuilder();
		serialize(root, builder);

		return builder.deleteCharAt(builder.length()-1).toString();
	}

	static void serialize(TreeNode root, StringBuilder builder) {
		if (root == null) {
			builder.append(NULL_FLAG).append(SPLITER);
			return;
		}

		builder.append(root.value).append(SPLITER);
		serialize(root.left, builder);
		serialize(root.right, builder);
	}

	// Decodes your encoded data to tree.
	static public TreeNode deserialize(String data) {
		if (data == null) {
			return null;
		}
		Queue<String> queue = new LinkedList<String>();
		queue.addAll(Arrays.asList(data.split(SPLITER)));
		return deserialize(queue);
	}

	static public TreeNode deserialize(Queue<String> queue) {
		String head = queue.remove();
		if (head.equals(NULL_FLAG)) {
			return null;
		}

		TreeNode root = new TreeNode(Integer.valueOf(head));
		root.left = deserialize(queue);
		root.right = deserialize(queue);
		return root;
	}
}
