package com.problem.basic.sort;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import java.util.Arrays;

public class KthElementFinderTest {

    @Test
    public void verifyKthElement() {
        // Arrange
        int[] arr = {2,4,6,8,7,3,9,1,0,5};
        int k = 4;
        int[] arrayToSort = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arrayToSort);

        // Act
        int kthElement = new KthElementFinder().sort(arr, k);

        // Assert
        assertEquals(arrayToSort[k - 1], kthElement);
    }

}