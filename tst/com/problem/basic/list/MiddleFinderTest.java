package com.problem.basic.list;

import com.util.basic.list.SingleLinkedList;
import org.junit.Test;

import static org.junit.Assert.*;

public class MiddleFinderTest {

    @Test
    public void find() {

        //Arrange
        int[] arr = {2,4,5,6,7,8,9,0,4,2,2};
        int expectedValue = arr[(arr.length - 1) / 2];
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        MiddleFinder middleFinder = new MiddleFinder();

        //Act
        for(int i = 0; i < arr.length; i++) {
            singleLinkedList.add(arr[i]);
        }
        int actualValue = middleFinder.findMiddleElement(singleLinkedList);

        //Assert
        assertEquals(expectedValue, actualValue);
    }
}