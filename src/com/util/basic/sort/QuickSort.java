package com.util.basic.sort;

/**
 * This Class implements Quicksort in ascending order
 * Start with a pivot( in this case it is last index) and wall(startIndex -1) and keep assembling the smaller elements
 * to the left of the wall and greater or equal elements to the right. keep sorting the assembled arrays.
 * space complexity = O(1)
 * time complexity = O(n*log n) for average case , O(n^2) for worst case.
 *
 */
public class QuickSort {
    public void sort(int[] arr) {
        if(arr == null) {
            throw new IllegalArgumentException();
        }

        sort(arr, 0, arr.length - 1);
    }

    private int findWall(int[] arr, int startIndex, int endIndex) {
        int pivot = endIndex;
        int wall = startIndex;
        for(int i = startIndex; i < endIndex; i++) {
            if(arr[i] < arr[pivot]) {
                SortUtility.swap(arr, i, wall);
                wall++;
            }
        }
        SortUtility.swap(arr, pivot, wall);
        return wall;

    }

    private void sort(int[] arr, int startIndex, int endIndex) {
        if(startIndex >= endIndex) {
            return;
        }

        int wall = findWall(arr, startIndex, endIndex);
        sort(arr, startIndex, wall - 1);
        sort(arr, wall + 1, endIndex);
    }
}


