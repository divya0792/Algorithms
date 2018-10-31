package com.leetcode.medium;

public class leetcode_19 {
    private class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode front = head;
        ListNode back = null;
        while(n != 1 && front.next != null) {
            front = front.next;
            n--;
        }

        while(front.next != null) {
            front = front.next;
            if(back == null) {
                back = head;
            } else {
                back = back.next;
            }
        }
        if(back == null) {
            return head.next;
        } else if(back.next == null) {
            return null;
        } else {
            back.next = back.next.next;
            return head;
        }
    }
}


