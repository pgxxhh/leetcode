package com.leetcode.coding.BinarySearch;

public class SqrtX {
    //1, 2, 3 , 4,5
    //pay attention to bounder value
    public static int sqrtX(int num) {
        int start = 1;
        int end = num;
        while (start <= end) {
            int mid = start + (end-start)/2;

            if (mid > num/mid) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return end;
    }
}
