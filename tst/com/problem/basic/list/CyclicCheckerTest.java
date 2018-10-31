package com.problem.basic.list;

import com.util.basic.list.SingleLinkedList;
import org.junit.Test;

import static org.junit.Assert.*;

public class CyclicCheckerTest {

    @Test
    public void check() {
        //Arrange
        int[] arr = {1,3,5,7,4,3,5,7,8,5,6,9};
        SingleLinkedList list = new SingleLinkedList();
        CyclicChecker cyclicChecker = new CyclicChecker();

        //Act
        for(int i : arr) {
            list.add(i);
        }
        boolean isCyclicActual = cyclicChecker.isCyclic(list);

        //Assert
        assertFalse(isCyclicActual);

        list.createCycle();
        isCyclicActual = cyclicChecker.isCyclic(list);

        assertTrue(isCyclicActual);

    }
}