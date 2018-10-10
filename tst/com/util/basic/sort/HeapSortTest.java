package com.util.basic.sort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class HeapSortTest {

    @Test
    public void sort() {
        //Arrange
        int[] arr = {2,4,6,85,4,2,1,5,7,8,9};
        HeapSort heapSort = new HeapSort();
        int[] expectedArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(expectedArr);

        //Act
        heapSort.sort(arr);

        //Assert
        assertArrayEquals(arr, expectedArr);
    }
}