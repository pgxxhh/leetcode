package com.leetcode.coding.linklist;

import java.util.Comparator;
import java.util.PriorityQueue;

public class InlineSort {

    public static class Node {
        public int value;
        public Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public static void printList(Node node) {
        while (node != null ) {
            System.out.println(node.value);
            node = node.next;
        }
    }

    public static Node inlineSort(Node node) {
        if (node == null || node.next == null) {
            return  node;
        }
        Node dummy = new Node(-1);
        Node pre = dummy;

        Node cur = node;
        Node next = null;
        while (cur != null) {
            pre = dummy;
            next = cur.next;
            while (pre.next != null && pre.next.value < cur.value) {
                pre = pre.next;
            }

            cur.next = pre.next;
            pre.next = cur;
            cur = next;
        }
        return dummy.next;
    }


    public int[] inlineSortOfArray(int[] arr) {
        int[] result = new int[arr.length];


        return result;
    }

}
