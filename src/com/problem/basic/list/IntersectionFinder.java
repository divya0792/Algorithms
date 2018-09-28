package com.problem.basic.list;

import com.util.basic.list.SingleLinkedList;
import com.util.basic.list.SingleLinkedList.Node;

public class IntersectionFinder {

    public boolean isIntersect(SingleLinkedList firstList, SingleLinkedList secondList) {
        if(firstList == null || secondList == null) {
            throw new IllegalArgumentException("list cannot be null");
        }

        int firstListCount = firstList.getCount();
        int secondListCount = secondList.getCount();
        Node firstNode = firstList.head;
        Node secondNode = secondList.head;

        if(firstListCount > secondListCount) {
            firstNode = getNodeStart(firstNode, firstListCount - secondListCount);
        } else if(firstListCount < secondListCount) {
            secondNode = getNodeStart(secondNode, secondListCount - firstListCount);
        }

        return isIntersect(firstNode, secondNode);
    }

    private Node getNodeStart(Node node, int excess) {
        while(excess != 0) {
            node = node.next;
            excess--;
        }
        return node;
    }

    private boolean isIntersect(Node firstNode, Node secondNode) {
        while(firstNode != null && secondNode != null) {
            if(firstNode == secondNode) {
                return true;
            }
            firstNode = firstNode.next;
            secondNode = secondNode.next;
        }
        return false;
    }
}
