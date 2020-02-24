package com.leetcode.coding.BinarySearch;

public class SqrtX {
    //1, 2, ,3 ,4
    public static int sqrtX(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("num shouldn't less then zero");
        }

        int start = 1;
        int end = num;
        while (start < end) {
            int mid = start + (end-start)/2;
            long temp = mid*mid;
            if (temp > num) {
                end = mid - 1;
            } else {
                start = mid;
            }
        }

        return start;
    }
}
