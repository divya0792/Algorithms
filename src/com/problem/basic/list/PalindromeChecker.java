package com.problem.basic.list;

import com.util.basic.list.SingleLinkedList;
import com.util.basic.list.SingleLinkedList.Node;

public class PalindromeChecker {

    public boolean isPalindrome(SingleLinkedList list) {
        if(list == null) {
            throw new IllegalArgumentException("list cannot be null");
        }
        if(list.head == null) {
            return true;
        }

        MiddleFinder middleFinder = new MiddleFinder();
        SingleLinkedList.Node midNode = middleFinder.findMiddleNode(list);
        SingleLinkedList compareList = new SingleLinkedList();

        while(midNode != null) {
            compareList.add(midNode.data);
            midNode = midNode.next;
        }

        compareList.reverse();

        SingleLinkedList.Node firstList = list.head;
        SingleLinkedList.Node secondList = compareList.head;
        while(firstList != compareList.head && secondList != null) {
            if(firstList.data != secondList.data) {
                return false;
            }
            firstList = firstList.next;
            secondList = secondList.next;
        }
        return true;

    }
}
