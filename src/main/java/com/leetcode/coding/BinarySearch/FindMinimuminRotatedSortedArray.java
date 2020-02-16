package com.leetcode.coding.BinarySearch;

public class FindMinimuminRotatedSortedArray {

    //divide and conquer
    //Input: [3,4,5,1,2] Output: 1
    //https://zxi.mytechroad.com/blog/leetcode/leetcode-153-find-minimum-in-rotated-sorted-array/ nice
    public static int findMinimuminRotatedSortedArray(int nums[]) {
        if (nums == null) {
            return -1;
        }
        return findMinimuminRotatedSortedArray(nums, 0, nums.length-1);
    }

    private static int findMinimuminRotatedSortedArray(int nums[], int start, int end) {
        // only 1 or 2 elements
        if (start+1 >= end) return Math.min(nums[start], nums[end]);

        //all in order
        if (nums[start] <= nums[end]) {
            return nums[start];
        }

        if (nums[start] <= nums[end]) {
            return nums[start];
        }

        int mid = start + (end-start)/2;
        int leftMin = findMinimuminRotatedSortedArray(nums, start, mid-1);
        int rightMin = findMinimuminRotatedSortedArray(nums, mid, end);
        return leftMin < rightMin ? leftMin : rightMin;
    }
}
