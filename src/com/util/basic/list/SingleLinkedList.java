package com.util.basic.list;

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

    public int getCount() {
        int count = 0;
        Node temp = head;
        while(temp != null) {
            count += 1;
            temp = temp.next;
        }
        return count;
    }

    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        for(int i = 0; i < 10; i++) {
            singleLinkedList.add(i);
        }
        System.out.print(singleLinkedList.getCount());
    }


}
