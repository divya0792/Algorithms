package com.problem.basic.search;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GreaterThanKTest {

    @Test
    public void search() {
        //Arrange
        int[] arr = {2,6,9,12,19,28,34,39,45,54,62,70};
        int[] key = {1,2,7,11,16,20,33,37,40,53,54,62};
        GreaterThanK findceilingValue = new GreaterThanK();
        for(int i = 0; i < key.length; i++) {
            //Act
            int actualIndex = findceilingValue.search(arr, key[i]);
            //Assert
            assertEquals(arr[i], actualIndex);
        }

    }

}