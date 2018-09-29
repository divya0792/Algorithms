package com.util.basic.list;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackUsingArrayTest {

    @Test
    public void stackOperationsTest() {
        StackUsingArray stackUsingArray = new StackUsingArray();
        assertTrue(stackUsingArray.isEmpty());

        int[] arrTest = {2,5,3,5,7,9,4,7,5};
        for(int i = 0; i <  arrTest.length; i++) {
            stackUsingArray.push(arrTest[i]);
        }
        assertEquals(arrTest.length, stackUsingArray.size());

        stackUsingArray.pop();
        stackUsingArray.push(24);
        stackUsingArray.push(36);
        stackUsingArray.pop();
        arrTest[arrTest.length - 1] = 24;

        assertArrayEquals(arrTest, stackUsingArray.toArray());
    }

}