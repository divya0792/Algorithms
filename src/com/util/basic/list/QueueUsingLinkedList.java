package com.util.basic.list;

import java.util.Queue;

public class QueueUsingLinkedList {
    private Node head;
    private Node tail;
    private int count = 0;

    private class Node {
        Node next;
        int data;

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public void enqueue(int data) {
        Node node;
        if(head == null || tail == null) {
            node = new Node(data, null);
            head = node;
        } else {
            node = new Node(data, tail);
        }
        tail = node;
    }

    public int dequeue() {
        if(head == null) {
            throw new IllegalStateException();
        }
        int deQueue = head.data;
        head = head.next;
        return deQueue;
    }
}
