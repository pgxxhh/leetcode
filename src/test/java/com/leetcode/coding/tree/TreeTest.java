package com.leetcode.coding.tree;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
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
        NTreeNode root = generateNTree();
        List<List<Integer>> actural = NaryTreeLevelOrderTraversal.levelOrder(root);

        List<List<Integer>> expect = new ArrayList<>();
        List level1List = Arrays.asList(1);
        List leve21List = Arrays.asList(2,3,4);
        expect.add((List<Integer>)level1List);
        expect.add((List<Integer>)leve21List);

        Assertions.assertEquals(expect, actural);
    }

    @Test
    public void testNaryTreePreorderTraversal() {
        NTreeNode root = generateNTree();
       // List<Integer> result = NaryTreePreorderTraversal.preorderIterative(root);
        List<Integer> result = NaryTreePreorderTraversal.preorderRecursive(root);

        List<Integer> expect = new ArrayList<>(Arrays.asList(1,2,3,4));

        Assertions.assertEquals(expect, result);
    }

    @Test
    public void testNaryTreePostOrderTraversal() {
        NTreeNode root = generateNTree();
      //  List<Integer> result = NaryTreePostorderTraversal.postorder(root);
        List<Integer> result = NaryTreePostorderTraversal.postOrderRecursive(root);

        List<Integer> expect = new ArrayList<>(Arrays.asList(2,3,4,1));
        Assertions.assertEquals(expect, result);
    }

    @Test
    public void testIsSameTree() {
        TreeNode tree1 = generateCommonTree();
        TreeNode tree2 = generateCommonTree();

       Assertions.assertEquals(true, SameTree.isSameTree(tree1, tree2));
    }

    @Test
    public void  testMaxDepthOfBinaryTree() {
        TreeNode tree = generateCommonTree();
        int result =  MaximumDepthOfBinaryTree.maxDepth(tree);

        Assertions.assertEquals(2, result);
    }

    private NTreeNode generateNTree() {
        List<NTreeNode> children = new ArrayList<>();


        NTreeNode child1 = new NTreeNode(2);
        NTreeNode child2 = new NTreeNode(3);
        NTreeNode child3 = new NTreeNode(4);

        children.add(child1);
        children.add(child2);
        children.add(child3);

        NTreeNode root = new NTreeNode(1, children);
        return root;
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
