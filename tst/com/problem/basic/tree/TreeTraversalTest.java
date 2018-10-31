package com.problem.basic.tree;

import com.util.basic.tree.BinarySearchTree;
import org.junit.Before;
import org.junit.Test;

public class TreeTraversalTest {
    private TreeTraversal treeTraversal;
    private BinarySearchTree binarySearchTree;

    @Before
    public void setUp() {
        treeTraversal = new TreeTraversal();
        binarySearchTree = new BinarySearchTree();
        int[] arr = {10, -8, 16, -10, -7, 14, 17, -11, -9, 13, 15, 18, 17};
        for(int arrItem : arr) {
            binarySearchTree.add(arrItem);
        }
    }

    @Test
    public void preOrder() {
        String actualString = treeTraversal.preOrder(binarySearchTree);
        System.out.println();
        System.out.println(actualString);
    }

    @Test
    public void inOrder() {
        String actualString = treeTraversal.inOrder(binarySearchTree);
        System.out.println();
        System.out.println(actualString);
    }

    @Test
    public void postOrder() {
        String actualString = treeTraversal.postOrder(binarySearchTree);
        System.out.println();
        System.out.println(actualString);
    }
}