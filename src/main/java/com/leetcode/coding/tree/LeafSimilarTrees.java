package com.leetcode.coding.tree;

import java.util.ArrayList;
import java.util.List;

public class LeafSimilarTrees {

    public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> root1Leafs = new ArrayList<>();
        List<Integer> root2Leafs = new ArrayList<>();

        getLeafs(root1, root1Leafs);
        getLeafs(root2, root2Leafs);
        return root1Leafs.equals(root2Leafs);
    }

    private static void getLeafs(TreeNode root, List<Integer> leafs) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            leafs.add(root.value);
        }

        getLeafs(root.left, leafs);
        getLeafs(root.right, leafs);
    }
}
