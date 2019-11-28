package com.leetcode.coding.linklisttest;

import com.leetcode.coding.tree.IsBinaryTreeSymmetry;
import com.leetcode.coding.tree.IsBinaryTreeSymmetry.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TreeTest {

    @Test
    public void testIsBinaryTreeSymmetry() {

        TreeNode left1 = new TreeNode(3);
        TreeNode right1 = new TreeNode(3);
        TreeNode left = new TreeNode(2, left1, null);
        TreeNode right = new TreeNode(2, null, right1);

        TreeNode root = new TreeNode(1, left, right);


        boolean result = IsBinaryTreeSymmetry.isBinaryTreeSymmetry(root);
        Assertions.assertEquals(result, true);
    }
}
