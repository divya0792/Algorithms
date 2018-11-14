package com.extras.midterm;

/*
Merge two binary trees into a new binary tree. The merge rule is that if two nodes overlap,
then sum node values up as the new value of the merged node.
Otherwise, the NOT null node will be used as the node of new tree.
Example:
Input:
	Tree 1                     Tree 2
          1                         2
         / \                       / \
        3   2                     1   3
       /                           \   \
      5                             4   7
Output:
Merged tree:
	     3
	    / \
	   4   5
	  / \   \
	 5   4   7
 */

public class Question_2 {

    public Node merge(Node first, Node second) {
        if(first == null && second == null) {
            return null;
        } else if(first == null) {
            return second;
        } else if(second == null) {
            return first;
        }

        Node merged = new Node(first.val + second.val);
        merged.left = merge(first.left, second.left);
        merged.right = merge(first.right, second.right);
        return merged;
    }
}
