package com.util.basic.list;

import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.*;

public class StackUsingLinkedListTest {

    @Test
    public void stackOperationsTest() {
        StackUsingLinkedList stackUsingLinkedList = new StackUsingLinkedList();
        assertTrue(stackUsingLinkedList.isEmpty());

        int[] arr = {2,5,3,5,7,9,0,7,5};
        for(int arrItem : arr) {
            stackUsingLinkedList.push(arrItem);
        }
        assertEquals(arr.length, stackUsingLinkedList.size());

        stackUsingLinkedList.pop();
        stackUsingLinkedList.push(24);
        stackUsingLinkedList.push(36);
        stackUsingLinkedList.pop();

        int[] expectedArr = {24,7,0,9,7,5,3,5,2};
        int arrCounter = 0;
        Iterator<Integer> iterator = stackUsingLinkedList.iterator();
        while(iterator.hasNext()) {
            assertEquals(expectedArr[arrCounter++], iterator.next().intValue());
        }

        assertArrayEquals(expectedArr, stackUsingLinkedList.toArray());
    }

}