package com.leetcode.coding.tree;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

/**
 * created by yangpeng on 2020/9/9
 */
public class PathSumIII {
	private static int count;

//	private static int pathSum(TreeNode root, int sum) {
//		if (root == null) return 0;
//		return pathSumFrom(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
//
//	}
//
//	private static int pathSumFrom(TreeNode node, int sum) {
//		if (node == null) return 0;
//		return (node.value == sum ? 1 : 0)
//				+ pathSumFrom(node.left, sum - node.value) + pathSumFrom(node.right, sum - node.value);
//	}



	//O(N)
	public int pathSum(TreeNode root, int sum) {
		if (root == null) {
			return 0;
		}
		Map<Integer, Integer> map = new HashMap<>();
		map.put(0, 1);
		return findPathSum(root, 0, sum, map);
	}
	private int findPathSum(TreeNode curr, int sum, int target, Map<Integer, Integer> map) {
		if (curr == null) {
			return 0;
		}
		// update the prefix sum by adding the current val
		sum += curr.value;
		// get the number of valid path, ended by the current node
		int numPathToCurr = map.getOrDefault(sum-target, 0);
		// update the map with the current sum, so the map is good to be passed to the next recursion
		map.put(sum, map.getOrDefault(sum, 0) + 1);
		// add the 3 parts discussed in 8. together
		int res = numPathToCurr + findPathSum(curr.left, sum, target, map)
				+ findPathSum(curr.right, sum, target, map);
		// restore the map, as the recursion goes from the bottom to the top
		map.put(sum, map.get(sum) - 1);
		return res;
	}

	public static void main(String[] args) {
		whatToEatTonight();
	}

	public static void whatToEatTonight() {
		int midNum = 4;
		final int lowBound = 0;
		final int upBound = 9;

		int randomNum = ThreadLocalRandom.current().nextInt(lowBound, upBound + 1);
		if (randomNum <= midNum) {
			System.out.println("今晚吃饭饭!");

			System.out.println("吃什么饭饭呢， 让上天思考一下");
			System.out.println("上天思考ING🤔 ....");
			System.out.println(".....");
			System.out.println(".....");
			System.out.println(".....");

			randomNum = ThreadLocalRandom.current().nextInt(0, 10 + 1);
			if (randomNum < 3) {
				System.out.println("想好了， 今天吃健康的绿叉子！");
			} else if (3 <= randomNum && randomNum < 6) {
				System.out.println("想好了， 今天吃油腻的小厨！");
			} else {
				System.out.println("想好了， 今天一切听你的宝贝的安排！");
			}

		} else {
			System.out.println("今晚减肥，不次东西！😭");
		}
	}
}
