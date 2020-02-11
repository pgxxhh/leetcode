package com.leetcode.coding.BinarySearch;

public class BinarySearch {

    public static int binarySearch(int[] nums, int target) {
        if (nums == null) {
            return -1;
        }

        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + end  >> 1;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }
}
