package com.leetcode.coding.divideandconquertest;

import com.leetcode.coding.divideandconquer.MajorityElement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DivideAndConquerTest {

    @Test
    public void testMajorityElement() {
        int[] arr = new int[] {2,2,1,1,1,2,2};
        Assertions.assertEquals(2,MajorityElement.majorityElemnt(arr));

    }
}
