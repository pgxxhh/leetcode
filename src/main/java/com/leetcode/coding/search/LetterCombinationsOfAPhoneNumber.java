package com.leetcode.coding.search;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * https://leetcode.com/problems/letter-combinations-of-a-phone-number/
 * Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.
 *
 * A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters
 *
 * Input: "23"
 * Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 */
public class LetterCombinationsOfAPhoneNumber {

    public static List<String> letterCombinationsOfAPhoneNumber(String digits) {
        if (digits == null || digits.isEmpty()) {
            return Collections.EMPTY_LIST;
        }

        String[] dictionary = new String[]{" ",
                "",
                "abc",
                "def",
                "ghi",
                "jkl",
                "mno",
                "pqrs",
                "tuv",
                "wxyz"};

        char[] cur = new char[digits.length()];
        List<String> result = new ArrayList<>();

        dfs(digits, dictionary, 0, cur, result);
        return result;
    }

    private static void dfs(final String digits, final String[] dictionary, int l, char[] cur, List<String> result) {
        if (l == digits.length()) {
            result.add(new String(cur));
            return;
        }

        String letters = dictionary[Character.getNumericValue(digits.charAt(l))];
        for (int i = 0; i < letters.length(); i++) {
            cur[l] = letters.charAt(i);
            dfs(digits, dictionary, l+1, cur, result);
        }
    }

}
