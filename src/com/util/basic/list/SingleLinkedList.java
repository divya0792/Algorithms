package com.util.basic.list;

import java.util.Random;

public class SingleLinkedList {

    public Node head;
    public Node tail;

    public class Node {
        public int data;
        public Node next;
    }

    public void add(int data) {
        Node node = new Node();
        if(tail == null || head == null) {
            node.data = data;
            node.next = null;
            tail = node;
            head = node;
        } else {
            node.data = data;
            node.next = null;
            tail.next = node;
            tail = node;
        }
    }

    public void addToHead(int data) {
        Node node = new Node();
        if(tail == null || head == null) {
            node.data = data;

        }
    }

    public void createCycle() {
        Random random = new Random();
        int randomNum = random.nextInt(getCount()) + 1;
        int start = 1;
        Node tempHead = this.head;
        while(start < randomNum) {
            tempHead = tempHead.next;
            start++;
        }
        tail.next = tempHead;
    }

    public void reverse() {
        Node back = null;
        Node middle = this.head;
        Node front;
        this.tail = middle;

        while(middle != null) {
            front = middle.next;
            middle.next = back;
            back = middle;
            middle = front;
        }
        this.head = back;
    }


    public int[] toArray() {
        int[] toArray = new int[getCount()];
        int arrayCounter = 0;
        Node temp = head;
        while(temp != null) {
            toArray[arrayCounter] = temp.data;
            arrayCounter++;
            temp = temp.next;
        }
        return toArray;
    }

    public int getCount() {
        int count = 0;
        Node temp = head;
        while(temp != null) {
            count += 1;
            temp = temp.next;
        }
        return count;
    }

}
