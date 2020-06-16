package com.leetcode.coding.tree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class NaryTreeLevelOrderTraversal {

    public static class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, List<Node> children) {
            this.val = val;
            this.children = children;
        }
    }

    public static List<List<Integer>> levelOrder(Node root) {
       List<List<Integer>> result = new ArrayList<>();
       if (root == null) {
           return  result;
       }

       LinkedList<Node> queue = new LinkedList();
       queue.add(root);
       while (!queue.isEmpty()) {
           List<Integer> levelResult = new ArrayList<>();
           int sizeNow = queue.size();
           for (int i = 0; i < sizeNow; i++) {
               Node node = queue.peek();
               levelResult.add(node.val);
               if (node.children != null && node.children.size() > 0) {
                   for (Node child : node.children) {
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
