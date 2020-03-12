package com.leetcode.coding.BinarySearch;

import java.util.Arrays;

/**
 * Input: weights = [1,2,3,4,5,6,7,8,9,10], D = 5
 * Output: 15
 * Explanation:
 * A ship capacity of 15 is the minimum to ship all the packages in 5 days like this:
 * 1st day: 1, 2, 3, 4, 5
 * 2nd day: 6, 7
 * 3rd day: 8
 * 4th day: 9
 * 5th day: 10
 *
 * Note that the cargo must be shipped in the order given, so using a ship of capacity 14 and splitting the packages into parts like (2, 3, 4, 5), (1, 6, 7), (8), (9), (10) is not allowed.
 * leetcode 1011
 */
public class ShipWithinDays {

	public static int shipWithinDays(int[] weights, int D) {
		int maxWeight = Arrays.stream(weights).max().getAsInt();
		int end = Arrays.stream(weights).sum() + 1;
		int start = maxWeight;
		while (start < end) {
			int mid = start + (end - start) / 2;
			int days = 1;
			int temp = 0;
			for (int weight : weights) {
				temp += weight;
				if (temp > mid) {
					temp = weight;
					++days;
				}
			}

			if (days > D) {
				start = mid + 1;
			} else {
				end = mid;
			}
		 }

		return start;
	}
}
