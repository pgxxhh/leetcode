package com.leetcode.coding.tree;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class TreeTest {

    @Test
    public void testBinaryTreeInorderTraversal() {
        TreeNode root = generateCommonTree();

        List<Integer> result =  BinaryTreeInorderTraversal.inorderTraversal(root);
        List<Integer> expect = Lists.newArrayList(2,1,3);
        Assertions.assertEquals(result, expect);
    }

    @Test
    public void testBinaryTreePreorderTraversal() {
        TreeNode root = generateTree();

        List<Integer> result = BinaryTreePreorderTraversal.binaryTreePreorderTraversal(root);
        List<Integer> expect = Lists.newArrayList(1,4,2,3);
        Assertions.assertEquals(result, expect);
    }

     private TreeNode generateCommonTree() {
         TreeNode root = new TreeNode(1);
         TreeNode left = new TreeNode(2);
         TreeNode right = new TreeNode(3);
         root.left = left;
         root.right = right;

         return root;
     }

    private TreeNode generateTree() {
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(4);
        TreeNode right = new TreeNode(3);
        TreeNode left2 = new TreeNode(2);
        root.left = left;
        root.right = right;
        left.left = left2;

        return root;
    }
}
