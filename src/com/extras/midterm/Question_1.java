package com.extras.midterm;

/*
Invert a binary tree.
Example:
Input:
     4
   /   \
  2     7
 / \   / \
1   3 6   9
Output:
     4
   /   \
  7     2
 / \   / \
9   6 3   1
 */

public class Question_1 {

    public Node invertTree(Node head) {
        if(head == null) {
            return head;
        }
        invert(head);
        return head;

    }
    private void invert(Node node) {
        if(node == null) {
            return;
        }

        Node temp = node.left;
        node.left = node.right;
        node.right = temp;

        invert(node.left);
        invert(node.right);
    }

}
