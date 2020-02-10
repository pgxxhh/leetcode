package com.leetcode.coding.BinarySearch;

public class SearchInsertPosition {
    //LeetCode 35. Search Insert Position
    public static int searchInsertPosition(int[] array, int value) {
        if (array == null) {
            return -1;
        }

        int start = 0;
        int end = array.length;

        while (start < end) {
            int middle = start + (end-1) >> 1;
            if (array[middle] == value) {
                return middle;
            } else if (array[middle] > value) {
                end = middle;
            } else {
                start = middle + 1;
            }
        }

        return start;
    }

}
