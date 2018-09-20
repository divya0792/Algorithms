package com.problem.basic.search;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FloorFinderTest {

    @Test
    public void search() {
        //Arrange
        int[] arr = {2, 6, 9, 12, 19, 28, 34, 39, 45, 54, 62, 70, 73};
        int[] key = {3, 6, 10, 12, 20, 28, 36, 40, 46, 55, 62, 72, 76};
        //int[] key = {36};
        FloorFinder findFloorValue = new FloorFinder();

        //Act
        for (int i = 0; i < key.length; i++) {
            int actualIndex = findFloorValue.findFloorValue(arr, key[i]);

            //Assert
            assertEquals(arr[i], actualIndex);
        }
    }

}