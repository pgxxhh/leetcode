package com.leetcode.coding.search;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class SearchTest {

    @Test
    public void testLetterCombinationsOfAPhoneNumber() {
        String digits = "23";
        List<String> results = LetterCombinationsOfAPhoneNumber.letterCombinationsOfAPhoneNumber(digits);
        List<String> expects = Lists.newArrayList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");

        Assertions.assertLinesMatch(expects, results);
    }
}
