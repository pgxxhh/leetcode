package com.leetcode.coding.tree;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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

    @Test
    public void testNaryTreeLevelOrderTraversal() {
        List<NaryTreeLevelOrderTraversal.Node> children = new ArrayList<>();


        NaryTreeLevelOrderTraversal.Node child1 = new NaryTreeLevelOrderTraversal.Node(2);
        NaryTreeLevelOrderTraversal.Node child2 = new NaryTreeLevelOrderTraversal.Node(3);
        NaryTreeLevelOrderTraversal.Node child3 = new NaryTreeLevelOrderTraversal.Node(4);

        children.add(child1);
        children.add(child2);
        children.add(child3);

        NaryTreeLevelOrderTraversal.Node root = new NaryTreeLevelOrderTraversal.Node(1, children);
        List<List<Integer>> actural = NaryTreeLevelOrderTraversal.levelOrder(root);

        List<List<Integer>> expect = new ArrayList<>();
        List level1List = Arrays.asList(1);
        List leve21List = Arrays.asList(2,3,4);
        expect.add((List<Integer>)level1List);
        expect.add((List<Integer>)leve21List);

        Assertions.assertEquals(expect, actural);
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
