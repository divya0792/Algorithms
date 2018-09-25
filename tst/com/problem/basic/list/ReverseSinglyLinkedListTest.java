package com.problem.basic.list;

import com.util.basic.list.SingleLinkedList;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ReverseSinglyLinkedListTest {

    @Test
    public void reverse() {

        //Arrange
        int[] arr = {5,4,3,2,1};
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        ReverseSinglyLinkedList reverseSinglyLinkedList = new ReverseSinglyLinkedList();

        //Act
        for(int i = 0; i < arr.length; i++) {
            singleLinkedList.add(arr[i]);
        }
        reverseSinglyLinkedList.reverse(singleLinkedList);
        Arrays.sort(arr);

        //Assert
        assertArrayEquals(arr, singleLinkedList.toArray());
    }

}