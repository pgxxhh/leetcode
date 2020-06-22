package com.leetcode.coding.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class NaryTreeLevelOrderTraversal {

    public static List<List<Integer>> levelOrder(NTreeNode root) {
       List<List<Integer>> result = new ArrayList<>();
       if (root == null) {
           return  result;
       }

       LinkedList<NTreeNode> queue = new LinkedList();
       queue.add(root);
       while (!queue.isEmpty()) {
           List<Integer> levelResult = new ArrayList<>();
           int sizeNow = queue.size();
           for (int i = 0; i < sizeNow; i++) {
               NTreeNode node = queue.peek();
               levelResult.add(node.val);
               if (node.children != null && node.children.size() > 0) {
                   for (NTreeNode child : node.children) {
                       queue.add(child);
                   }
               }
               queue.pop();
           }
           result.add(levelResult);
       }

       return result;
    }

}
