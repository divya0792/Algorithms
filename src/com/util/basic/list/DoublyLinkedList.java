package com.util.basic.list;

public class DoublyLinkedList {

    private Node head;
    private Node tail;
    private int count = 0;

    private class Node {
        int data;
        Node next;
        Node prev;

        Node(int data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }

    public void addToTail(int data) {
        Node nodeToAdd;

        if(head == null || tail == null) {
            nodeToAdd = new Node(data, null, null);
            head = nodeToAdd;
        } else {
            nodeToAdd = new Node(data, null, tail);
            tail.next = nodeToAdd;
        }
        tail = nodeToAdd;
        count++;
    }

    public void addToHead(int data) {
        Node nodeToAdd;

        if(head == null || tail == null) {
            nodeToAdd = new Node(data, null, null);
            tail = nodeToAdd;
        } else {
            nodeToAdd = new Node(data, head, tail);
            head.prev = nodeToAdd;
        }
        head = nodeToAdd;
        count++;
    }

    public int[] toArray() {
        int[] toArray = new int[this.count];
        int arrayCounter = 0;
        Node temp = head;
        while(temp != null) {
            toArray[arrayCounter] = temp.data;
            arrayCounter++;
            temp = temp.next;
        }
        return toArray;
    }

    public void addSorted(int data) {
        Node nodeToAdd;
        count++;

        if(head == null || tail == null){
            nodeToAdd = new Node(data, null, null);
            head = nodeToAdd;
            tail = nodeToAdd;
        } else {
            Node temp = head;
            while(temp != null) {
                if(temp.prev == null && temp.data > data) {
                    nodeToAdd = new Node(data, head, null);
                    head.prev = nodeToAdd;
                    head = nodeToAdd;
                    return;
                } else if(temp.next == null && temp.data <= data) {
                    nodeToAdd = new Node(data, null, tail);
                    tail.next = nodeToAdd;
                    tail = nodeToAdd;
                    return;
                } else if((temp.data <= data) && (temp.next.data > data)){
                    nodeToAdd = new Node(data, temp.next, temp);
                    temp.next.prev = nodeToAdd;
                    temp.next = nodeToAdd;
                    return;
                }
                temp = temp.next;
            }
        }
    }

    public int getCount() {
        return count;
    }

}
