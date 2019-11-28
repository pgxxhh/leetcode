package com.leetcode.coding.linklisttest;

import com.leetcode.coding.linklist.InlineSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.leetcode.coding.linklist.InlineSort.printList;

public class LinkListTest {

    @Test
    void testInlineSort() {
        InlineSort.Node node0 = new InlineSort.Node(2);
        InlineSort.Node node1 = new InlineSort.Node(3);
        InlineSort.Node node2 = new InlineSort.Node(1);
        InlineSort.Node node3 = new InlineSort.Node(4);
        InlineSort.Node node4 = new InlineSort.Node(5);
        node0.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        InlineSort.Node result = InlineSort.inlineSort(node0);
        printList(result);

        Assertions.assertEquals(node2, result);
    }
}
