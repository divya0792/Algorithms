package com.problem.basic.sort;

import com.util.basic.sort.SortUtility;

/**
 * To find kth smallest/largest element in an array
 * space complexity = O(1)
 * time complexity = O(n * log n) for average case O(n^2) for worst case.
 */
public class KthElementFinder {
    public int find(int[] arr, int k) {
        sort(arr, 0, arr.length - 1, k - 1);
        return arr[k - 1];
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

    private void sort(int[] arr, int startIndex, int endIndex, int k) {
       int wall = findWall(arr, startIndex, endIndex);
       if(wall == k) {
           return;
       } else if(k < wall) {
           sort(arr, startIndex, wall - 1, k);
       } else {
           sort(arr, wall + 1, endIndex, k);
       }
    }
}
