package com.util.basic.sort;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import java.util.Arrays;

public class QuickSortTest {

    @Test
    public void sort() {
        // Arrange
        int[] arr = {4,3,7,5,6,2,3,8,9,0,2,1,3,4};
        int[] expectedSortedArray = Arrays.copyOf(arr, arr.length);
        Arrays.sort(expectedSortedArray);
        QuickSort quickSort = new QuickSort();

        // Act
        quickSort.sort(arr);

        // Assert
        assertArrayEquals(expectedSortedArray, arr);
    }
}