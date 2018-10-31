package com.problem.basic.list;

import com.util.basic.list.SingleLinkedList;

public class MiddleFinder {

    public int findMiddleElement(SingleLinkedList list) {
        if(list == null) {
            throw new IllegalArgumentException("list cannot be null");
        }
        if(list.head == null) {
            throw new IllegalArgumentException("value does not exists");
        }
        return findMiddleNode(list).data;
    }

    public SingleLinkedList.Node findMiddleNode(SingleLinkedList list) {
        SingleLinkedList.Node front = list.head;
        SingleLinkedList.Node back = list.head;
        while(front != null) {
            front = front.next;
            if(front != null) {
                front = front.next;
                back = back.next;
            }
        }
        return back;
    }
}