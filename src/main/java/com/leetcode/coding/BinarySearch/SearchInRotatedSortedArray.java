package com.leetcode.coding.BinarySearch;

public class SearchInRotatedSortedArray {

    //pay attention to bound
    public static int searchInRotatedSortedArray(int nums[], int target) {
        if (nums == null) {
            return -1;
        }

        int start =0;
        int end = nums.length-1;

        while (start <= end) {
            int mid = (start + end)>>1;
            if (nums[mid] == target) {
                return mid;
            }
            //left part are sorted
            if (nums[start] <= nums[mid]) {
                //target in here
                if (target>=nums[start] && target < nums[mid]) {
                    end = mid-1;
                } else {
                    start = mid+1;
                }
            } else {
                //right part are sorted
                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid-1;
                }
            }
        }

        return -1;
   }

}
