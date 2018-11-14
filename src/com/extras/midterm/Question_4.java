package com.extras.midterm;

/*
Delete node(s) from a circular link list.
You would be given an int value and you have to delete all the nodes which
have data equal to the given int value.
*/

public class Question_4 {
    public static Node deleteNode(Node head, int val) {
        Node front = head;
        Node dummy = new Node(-1);
        dummy.next = head;
        Node back = dummy;

        while(front != back) {
            front = front.next;

            if(back.next.val == val) {
                back.next = back.next.next;
            }
            front = front.next;
            back = back.next;
        }
        return dummy.next;
    }


    public static void main(String[] args) {
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(2);
        Node fifth = new Node(4);
        Node sixth = new Node(5);
        Node seventh = new Node(6);
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = seventh;
        seventh.next = second;
        deleteNode(first, 4);
    }

}
