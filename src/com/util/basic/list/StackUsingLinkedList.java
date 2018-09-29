package com.util.basic.list;

import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class StackUsingLinkedList implements Iterable<Integer> {
    private Node head;
    private int count = 0;

    private class Node {
        int data;
        Node next;

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    private class ListIterator implements Iterator<Integer> {
        private Node current = head;

        @Override
        public boolean hasNext(){
            return current != null;
        }

        @Override
        public Integer next() {
            if(!hasNext()) {
                throw new NoSuchElementException("element does not exists");
            }
            int currentData = current.data;
            current = current.next;
            return currentData;
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return new ListIterator();
    }

    public void push(int data) {
        Node node;
       if(head == null) {
            node = new Node(data, null);
       } else {
            node = new Node(data, head);
       }
       head = node;
       count++;
    }

    public int pop() {
        int returnHead;
        if(head == null) {
            throw new EmptyStackException();
        } else {
            returnHead = head.data;
            head = head.next;
        }
        count--;
        return returnHead;
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
       return count == 0;
    }

    public int[] toArray() {
        int[] arr = new int[size()];
        Node temp = head;
        int start = 0;
        while(temp != null){
            arr[start] = temp.data;
            temp = temp.next;
            start++;
        }
        return arr;
    }
}
