package com.leetcode.coding.BinarySearch;


/**
 * Input: nums = [1,2,1,3,5,6,4]
 * Output: 1 or 5
 * Explanation: Your function can return either index number 1 where the peak element is 2,
 *              or index number 5 where the peak element is 6.
 */
public class FindPeakElement {

    public static int findPeakElement(int nums[]) {
        if (nums == null) {
            return -1;
        }

        if (nums.length == 1) {
            return 0;
        }

        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end-start)/2;
            if (nums[mid] < nums[mid+1]) {
                start = mid+1;
            } else {
                end = mid;
            }
        }

        return end;
    }
}
