package com.leetcode.coding.divideandconquer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * leetcode 169
 * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 *
 * You may assume that the array is non-empty and the majority element always exist in the array.
 *
 * Example 1:
 *
 * Input: [3,2,3]
 * Output: 3
 * Example 2:
 *
 * Input: [2,2,1,1,1,2,2]
 * Output: 2
 */
public class MajorityElement {

    /**
     * use hash table, O(n) sapce, O(n) time
     * @param arr
     * @return
     */
    public static int majorityElemnt(int[] arr) {
        if (arr == null) {
            return -1;
        }

        Map<Integer, Integer> numberCountMap = new HashMap<Integer,Integer>(arr.length);
        for (int i : arr) {
            if (!numberCountMap.containsKey(i)) {
                numberCountMap.put(i, 1);
            } else {
                numberCountMap.put(i, numberCountMap.get(i) + 1);
            }
        }

        int halfLength = arr.length >> 1;
        for (Map.Entry entry : numberCountMap.entrySet()) {
            if ((Integer)entry.getValue() > halfLength) {
                return (Integer)entry.getKey();
            }
        }
        return -1;
    }
}
