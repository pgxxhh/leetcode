package com.leetcode.coding.BinarySearch;

import com.sun.tools.javac.util.ArrayUtils;
import java.util.Arrays;
import java.util.Collections;

/**
 * https://leetcode.com/problems/koko-eating-bananas/
 */
public class KoKoEatingBananas {

	/**
	 * Input: piles = [3,6,7,11], H = 8
	 * Output: 4
	 * @param piles
	 * @param H
	 * @return
	 */
	public static int minEatingSpeed(int[] piles, int H) {
		if (piles == null) {
			return -1;
		}

		int less = 1;
		int max = Arrays.stream(piles).max().getAsInt()+1;

		while (less < max) {
			int m = less + (max-less)/2;
			int totalNeedHour = 0;
			for (int pile : piles) {
				int hPerNum = (pile+m-1)/m; //notice the order
				totalNeedHour += hPerNum;
			}

			if (totalNeedHour <= H) {
				max = m;
			} else if (totalNeedHour > H) {
				less = m+1;
			}
		}

		return less;

	}

}
