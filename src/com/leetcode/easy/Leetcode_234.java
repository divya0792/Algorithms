package com.leetcode.easy;

public class Leetcode_234 {
    private class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) {
            return true;
        }
        ListNode start = head;
        ListNode reversedMiddle = findMiddle(head);

        while(reversedMiddle != null && start != null) {
            if(reversedMiddle.val != start.val) {
                return false;
            }
            reversedMiddle = reversedMiddle.next;
            start = start.next;
        }
        return true;
    }

    private ListNode findMiddle(ListNode head) {
        ListNode front = head;
        ListNode back = head;
        while(front != null) {
            front = front.next;
            if(front != null) {
                front = front.next;
                back = back.next;
            }
        }
        return reverse(back);
    }

    private ListNode reverse(ListNode head) {
        ListNode back = null;
        ListNode middle = head;
        ListNode front = null;

        while(middle != null) {
            front = middle.next;
            middle.next = back;
            back = middle;
            middle = front;
        }
        return back;
    }

    public static void main(String[] args) {
        Leetcode_234 leet = new Leetcode_234();
        Leetcode_234.ListNode head = leet.new ListNode(1);
        head.next = leet.new ListNode(0);
        head.next.next = leet.new ListNode(3);
        head.next.next.next = leet.new ListNode(4);
        head.next.next.next.next = leet.new ListNode(0);
        head.next.next.next.next.next = leet.new ListNode(1);
        leet.isPalindrome(head);
    }
}
