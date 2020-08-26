package com.leetcode.coding.tree;

import org.assertj.core.util.Lists;
import org.junit.Assert;
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

    @Test
    public void testBalancedBinaryTree() {
        TreeNode tree = generateCommonTree();
        Assertions.assertEquals(true, BalancedBinaryTree.isBalanced(tree));

        TreeNode node = new TreeNode(4);
        TreeNode node2 = new TreeNode(5);
        tree.left.left = node;
        tree.left.left.left = node2;
        Assertions.assertEquals(false, BalancedBinaryTree.isBalanced(tree));
    }

    @Test
    public void testMinimumDepthOfBianryTree() {
        TreeNode root = generateCommonTree();
//        int result = MinimumDepthOfBinaryTree.minDepth(root);
//        Assertions.assertEquals(2, result);

        root.right.right = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.left.left = new TreeNode(4);
        Assertions.assertEquals(3, MinimumDepthOfBinaryTree.minDepth(root));
    }

    @Test
    public void testSubTreeOfAnotherTree() {
        TreeNode s = generateCommonTree();
        TreeNode t = generateCommonTree();

        Assertions.assertEquals(SubtreeOfAnotherTree.isSubtree(s, t), true);
        t.left.value = 999;
        Assertions.assertEquals(SubtreeOfAnotherTree.isSubtree(s, t), false);
    }

    @Test
    public void testBinaryTreeLevelOrderTraversal() {
        TreeNode root = generateCommonTree();
        List<List<Integer>> expected = new ArrayList<>();
        List<Integer> list0 = new ArrayList<>();
        list0.add(1);
        List<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(3);
        expected.add(list0);
        expected.add(list1);

        Assertions.assertEquals(expected, BinaryTreeLevelOrderTraversal.levelOrder(root));
    }

    @Test
    public void testBinaryTreeLevelOrderTraversalII() {
        TreeNode root = generateCommonTree();
        List<List<Integer>> expected = new ArrayList<>();
        List<Integer> list0 = new ArrayList<>();
        list0.add(1);
        List<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(3);
        expected.add(list1);
        expected.add(list0);

        Assertions.assertEquals(expected, BinaryTreeLevelOrderTraversalII.levelOrderBottom(root));
    }

    @Test
    public void testLeafSimilarTrees() {
        TreeNode root1 = generateCommonTree();
        TreeNode root2 = generateCommonTree();
        Assertions.assertEquals(LeafSimilarTrees.leafSimilar(root1, root2), true);

        root1.left.left = new TreeNode(5);
        Assertions.assertEquals(LeafSimilarTrees.leafSimilar(root1, root2), false);
    }

    @Test
    public void testBinaryTreePruning() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(0);
        root.right = new TreeNode(1);

        TreeNode result = new TreeNode(1);
        result.right = new TreeNode(1);
        Assertions.assertEquals(result, BinaryTreePruning.pruneTree(root));
    }

    @Test
    public void testTrimABinaryTree() {
        TreeNode root = generateCommonTree();
        TreeNode result = new TreeNode(1);
        result.left = new TreeNode(2);
        Assertions.assertEquals(result, TrimABinaryTree.trimBST(root, 1,2));
    }

    @Test
    public void testDeleteLeavesWithAGivenValue() {
        TreeNode root = new TreeNode(1);
        TreeNode node0 = new TreeNode(2);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(2);

        TreeNode result = new TreeNode(1);

        root.left = node0;
        root.left.left = node2;
        root.right = node1;

        Assert.assertEquals(DeleteLeavesWithAGivenValue.removeLeafNodes(root, 2), result);
    }

    @Test
    public void testPathSum() {
        TreeNode root = generateCommonTree();
        Assertions.assertEquals(true, PathSum.hasPathSum(root, 3));
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
