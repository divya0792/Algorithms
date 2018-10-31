package com.problem.basic.list;

import com.util.basic.list.SingleLinkedList;
import org.junit.Test;

import static org.junit.Assert.*;

public class NthElementFinderTest {

    @Test
    public void find() {

        //Arrange
        int[] arr = {1,2,3,4,5,6,7,8,9,0};
        int key = 3;
        int expectedValue = arr[arr.length - key];
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        NthElementFinder nthElementFinder = new NthElementFinder();

        //Act
        for(int i = 0; i < arr.length; i++) {
            singleLinkedList.add(arr[i]);
        }
        int actualValue = nthElementFinder.findNthElementFromEnd(singleLinkedList, key);

        //Assert
        assertEquals(expectedValue, actualValue);

    }
}