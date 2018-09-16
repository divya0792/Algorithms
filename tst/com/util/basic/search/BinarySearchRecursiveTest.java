package com.util.basic.search;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class BinarySearchRecursiveTest {

    @Test
    public void search() {
        // Arrange
        int[] arr = {2,4,6,8,9,11,15,18,21,26,29,38,42};
        int key = 18;
        int expectedPosition = Arrays.binarySearch(arr, 18);
        BinarySearchRecursive binarySearchRecursive = new BinarySearchRecursive();

        // Act
        int actualPosition = binarySearchRecursive.search(arr, key);

        // Assert
        assertEquals(expectedPosition, actualPosition);
    }



}