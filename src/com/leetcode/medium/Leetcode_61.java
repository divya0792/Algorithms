package com.leetcode.medium;

public class Leetcode_61 {
     private class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) {
            return null;
        }
        if(head.next == null || k == 0) {
            return head;
        }
        ListNode front = head;
        ListNode last = null;
        ListNode back = head;
        while(k > 0) {
            if(front.next != null) {
                front = front.next;
            } else {
                last = front;
                front = head;
            }
            k--;
        }
        if(last == front) {
            front = head;
        } else {
            while(front.next != null) {
                front = front.next;
                back = back.next;
            }
        }

        if(last != null && back == head) {
            front = last;
            back = front;
        }
        front.next = head;
        head = back.next;
        back.next = null;

        return head;
     }

    public static void main(String[] args) {
        Leetcode_61 leet = new Leetcode_61();
        Leetcode_61.ListNode head = leet.new ListNode(0);
        head.next = leet.new ListNode(1);
        head.next.next = leet.new ListNode(2);

        System.out.println(leet.rotateRight(head,4));
    }
}
