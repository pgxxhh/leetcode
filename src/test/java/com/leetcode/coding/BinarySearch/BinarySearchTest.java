package com.leetcode.coding.BinarySearch;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinarySearchTest {

    @Test
    public void testSearchInsertPosition() {
        int[] arr = new int[] {1,3,5,6};
        int value = 2;

        int result = SearchInsertPosition.searchInsertPosition(arr, value);
        Assertions.assertEquals(result, 1);
    }
}
