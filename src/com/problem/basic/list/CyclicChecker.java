package com.problem.basic.list;

import com.util.basic.list.SingleLinkedList;
import com.util.basic.list.SingleLinkedList.Node;

public class CyclicChecker {

    public boolean isCyclic(SingleLinkedList list) {
        if (list == null) {
            throw new IllegalArgumentException("list cannot be null");
        }
        if (list.head == null) {
            throw new IllegalArgumentException("list cannot be empty");
        }


        Node front = list.head;
        Node back = list.head;

        while (front != null) {
            front = front.next;
            if (front == null) {
                return false;
            } else if (front == back) {
                break;
            }
            front = front.next;
            back = back.next;
        }

        return true;
    }
}
