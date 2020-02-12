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

    @Test
    public void testBinarySearch() {
        int[] nums = new int[] {-1,0,3,5,9,12};
        int target = 9;

        int result = BinarySearch.binarySearch(nums, 9);
        Assertions.assertEquals(result, 4);
    }

    @Test
    public void testTimeMap() {
        TimeBasedKeyValueStore valueStore = new TimeBasedKeyValueStore();
        valueStore.set("pgpgpgg", "handsome", 1);


        Assertions.assertEquals(valueStore.get("pgpgpgg", 5), "handsome");
    }
}
