package com.problem.basic.list;

import com.util.basic.list.SingleLinkedList;

public class CyclicStartFinder {

    public int findStartOfCycle(SingleLinkedList list) {
        if(list == null) {
            throw new IllegalArgumentException("list cannot be null");
        }

        if(list.head == null) {
            throw new IllegalArgumentException("list cannot be empty");
        }

        SingleLinkedList.Node front = list.head;
        SingleLinkedList.Node back = list.head;

        while(front != null) {
            front = front.next;
            if(front == null) {
                throw new IllegalArgumentException("list is not cyclic");
            }
            if(front == back) {
                break;
            }
            front = front.next;
            back = back.next;
        }
        front = list.head;

        while(front != back) {
            front = front.next;
            back = back.next;
        }
        return front.data;
    }
}
