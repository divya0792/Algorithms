package com.problem.basic.list;

import com.util.basic.list.SingleLinkedList;

/**
 * To find nth element from the end in a singly linked list.
 */
public class NthElementFinder {

    public int findNthElementFromEnd(SingleLinkedList list, int key) {
        if(key <= 0) {
            throw new IllegalArgumentException("key cannot be 0 or negative");
        }
        if(list == null) {
            throw new IllegalArgumentException("list cannot be null");
        }
        if(list.head == null) {
            throw new IllegalArgumentException("value does not exists");
        }
        SingleLinkedList.Node front = list.head;
        SingleLinkedList.Node back = list.head;

       for(int i = 0; i < key; i++) {
           if(front == null) {
               throw new IllegalArgumentException("value does not exists");
           }
           front = front.next;
       }

       while(front != null) {
           front = front.next;
           back = back.next;
       }
       return back.data;
    }
}
