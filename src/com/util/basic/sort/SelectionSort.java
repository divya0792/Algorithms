package com.util.basic.sort;

/**
 * This class implements Selection Sort in ascending order
 * This method assumes first element as minIndex and keeps comparing with the
 * next one till minIndex has index of the lowest number and keeps sorting
 * space complexity = O(1)
 * time complexity = O(n^2)
 */
public class SelectionSort {

    public void sort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
                if(minIndex != i) {
                    SortUtility.swap(arr, minIndex, i);
                }
        }
    }

}
