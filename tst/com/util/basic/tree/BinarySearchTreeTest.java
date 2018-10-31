package com.util.basic.tree;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class BinarySearchTreeTest {

    @Test
    public void add() {

        //Arrange
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        int[] arr = {10, -8, 16, -10, -6, 14, 17, -11, -9, 13, 15, 18, 17, -6, -5};
        //int[] arr = {5,2,6,3,4};
        //int[] arr = {9, 6, 10, 4, 8, 12};

        //Act
        for (int arrItem : arr) {
            binarySearchTree.add(arrItem);
        }

        //Assert
        for (int arrItem : arr) {
            assertTrue(binarySearchTree.search(arrItem));
        }

        System.out.println(binarySearchTree.findKthLargest(5));
        //binarySearchTree.printRange(10, 16);



        //System.out.println(binarySearchTree.height());
       // binarySearchTree.printLevelOrder();
        //binarySearchTree.printAlternateOrder();
        //binarySearchTree.printLeftNodes();
        //binarySearchTree.printLeafNodes();
        //binarySearchTree.printPerimeterNodes();
        //binarySearchTree.printBottomView();
        //System.out.println("top View");
        //binarySearchTree.printTopView();
        //System.out.println("width is " + binarySearchTree.getWidth());
        //System.out.println(binarySearchTree.isPerfect());
        //System.out.print(binarySearchTree.areLeafNodesAtSameLevel());







    }

}