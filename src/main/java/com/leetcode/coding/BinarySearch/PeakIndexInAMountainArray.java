package com.leetcode.coding.BinarySearch;

/**
 * Let's call an array A a mountain if the following properties hold:
 *
 * A.length >= 3
 * There exists some 0 < i < A.length - 1 such that A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1]
 * Given an array that is definitely a mountain, return any i such that A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1].
 */
public class PeakIndexInAMountainArray {

    public static int peakIndexInAMountainArray(int nums[]) {
        if (nums == null) {
            return -1;
        }

        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end-start)/2;
            if (nums[mid] > nums[mid+1]) {
                end = mid;
            } else {
                start = mid+1;
            }
        }

        return start;
    }
}
