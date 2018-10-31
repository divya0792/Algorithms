package com.problem.basic.tree;

import com.util.basic.tree.BinarySearchTree;
import com.util.basic.tree.BinarySearchTree.Node;


public class TreeTraversal {

    public String preOrder(BinarySearchTree tree){
        if(tree == null) {
            throw new IllegalArgumentException("tree is null");
        }

        String printString = "";
        return preOrder(tree.root, printString);
    }

    private String preOrder(Node node, String printString) {
        if(node == null) {
            return printString;
        }
        System.out.print(node.data + ", ");
        printString += node.data + ", ";

        printString = preOrder(node.left, printString);
        return preOrder(node.right, printString);
    }

    public String inOrder(BinarySearchTree tree) {
        if(tree == null) {
            throw new IllegalArgumentException("tree is null");
        }

        String inOrderString = "";

        return inOrder(tree.root, inOrderString);
    }

    private String inOrder(Node node, String inOrderString) {
        if(node == null) {
            return inOrderString;
        }
        inOrderString = inOrder(node.left, inOrderString);

        System.out.print(node.data + ", ");
        inOrderString += node.data + ",";

        return inOrder(node.right, inOrderString);
    }

    public String postOrder(BinarySearchTree tree) {
        if(tree == null) {
            throw new IllegalArgumentException("tree is null");
        }
        return postOrder(tree.root, "");
    }

    private String postOrder(Node node, String postOrderString) {
        if(node == null) {
            return postOrderString;
        }
        postOrderString = postOrder(node.left, postOrderString);
        postOrderString = postOrder(node.right, postOrderString);

        System.out.print(node.data + ", ");
        postOrderString += node.data + ", ";
        return postOrderString;
    }
}




















