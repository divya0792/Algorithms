package com.extras.midterm;

/*
Given two binary trees, write a function to check if they are the same or not.
Two binary trees are considered the same if they are structurally identical and the nodes have the same value.
 */
public class Question_3 {
    public boolean checkIfSame(Node first, Node second) {
        if(first == null && second == null) {
            return true;
        } else if(first == null || second == null) {
            return false;
        } else if(first.val == second.val) {
            return checkIfSame(first.left, second.left) && checkIfSame(first.right, second.right);
        } else {
            return false;
        }
    }
}
