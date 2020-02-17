package com.leetcode.coding.BinarySearch;

public class FindMinimumInRotatedSortedArrayII {

    //average O(logn), worst: 0(n)
    public static int findMinimuminRotatedSortedArray(int nums[]) {
        if (nums == null) {
            return -1;
        }

        return findMinimuminRotatedSortedArray(nums, 0, nums.length-1);
    }

    private static int findMinimuminRotatedSortedArray(int nums[], int start, int end) {
        //only one or two elements
        if (start+1 >= end) {
            return nums[start] - nums[end] > 0 ? nums[end] : nums[start];
        }

        //all in order, less but not equal,  [2,2,2,2,3,1,2]
        if (nums[start] < nums[end]) {
            return nums[start];
        }

        int mid = start + (end-start)/2;
        return Math.min(findMinimuminRotatedSortedArray(nums, start, mid-1), findMinimuminRotatedSortedArray(nums, mid, end));
    }
}
