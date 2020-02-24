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


        Assertions.assertEquals(valueStore.get("pgpgpgg", 2), "handsome");
    }

    @Test
    public void testSearchInRotatedSortedArray() {
       int index = SearchInRotatedSortedArray.searchInRotatedSortedArray(new int[]{4,5,6,1,2,3}, 5);
       Assertions.assertEquals(1, index);
    }

    @Test
    public void testFindMinimuminRotatedSortedArray() {
        int minNum = FindMinimuminRotatedSortedArray.findMinimuminRotatedSortedArray(new int[]{3,4,5,1,2});
        Assertions.assertEquals(minNum, 1);
    }

    @Test
    public void testFindMinimuminRotatedSortedArrayII() {
        int minNum = FindMinimumInRotatedSortedArrayII.findMinimuminRotatedSortedArray(new int[]{2,2,2,2,3,1,2});
        Assertions.assertEquals(minNum, 1);
    }

    @Test
    public void testFindPeakElement() {
        int result = FindPeakElement.findPeakElement(new int[]{1,2,1,3,5,6,4});
        Assertions.assertEquals(result, 5);
    }

    @Test
    public void testPeakIndexInAMountainArray() {
        int result = PeakIndexInAMountainArray.peakIndexInAMountainArray(new int[]{1,2,1});
        Assertions.assertEquals(result, 1);
    }

    @Test
    public void testSqrtX() {
        int result = SqrtX.sqrtX(4);
        Assertions.assertEquals(result, 2);
    }
}
