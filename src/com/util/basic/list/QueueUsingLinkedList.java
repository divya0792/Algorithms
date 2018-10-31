package com.util.basic.list;

import com.util.basic.tree.BinarySearchTree;

import java.util.Iterator;
import java.util.Queue;

public class QueueUsingLinkedList<E> implements Iterable<E> {
    private Node head;
    private Node tail;
    private int count = 0;

    private class Node {
        Node next;
        E data;

        Node(E data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public Iterator<E> iterator() {
        return new QueueIterator();
    }

    private class QueueIterator implements Iterator<E> {
        Node current = head;

        @Override
        public boolean hasNext() {
            return current.next == null;
        }

        @Override
        public E next() {
            if(current == null) {
                throw new IllegalArgumentException("empty");
            }
            E currentData = current.data;
            current = current.next;
            return currentData;
        }
    }

    public void enqueue(E data) {
        Node node;
        if(head == null || tail == null) {
            node = new Node(data, null);
            head = node;
        } else {
            node = new Node(data, null);
            tail.next = node;
        }
        tail = node;
        count++;
    }


    public E dequeue() {
        if(head == null) {
            throw new IllegalStateException();
        }
        E deQueue = head.data;
        head = head.next;
        count--;
        return deQueue;
    }

    public int getCount() {
        return count;
    }
}
