package com.leetcode.medium;

public class Leetcode_82 {
     static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public static ListNode deleteDuplicates(ListNode head) {
        if(head == null) {
            return null;
        }
        ListNode front = head;
        ListNode middle = head;
        ListNode back = new ListNode(-1);
        head = back;

        while(front != null) {
            front = front.next;

            if(front == null || middle.val != front.val) {
                back.next = middle;
                back = back.next;
            } else {
                while(front != null && middle.val == front.val) {
                    front = front.next;
                }
            }
            middle = front;
        }
        return head.next;
    }

    public static void main(String[] args) {
         ListNode node = new ListNode(1);
         node.next = new ListNode(2);
         node.next.next = new ListNode(2);
         //node.next.next.next = new ListNode(3);
         //node.next.next.next.next = new ListNode(4);
         //node.next.next.next.next.next = new ListNode(4);
         //node.next.next.next.next.next.next = new ListNode(5);
         deleteDuplicates(node);

    }
}
