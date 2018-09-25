package com.util.basic.list;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class DoublyLinkedListTest {
    @Test
    public void addSorted() {

        //Arrange
        int[] arr = {3,5,8,2,1,7,0,4,6,9};
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

        //Act
        for(int i = 0; i < arr.length; i++) {
            doublyLinkedList.addSorted(arr[i]);
        }
        Arrays.sort(arr);

        //Assert
        assertArrayEquals(arr, doublyLinkedList.toArray());
    }

}