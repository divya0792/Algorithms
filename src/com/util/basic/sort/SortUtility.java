package com.util.basic.sort;

/**
 * This class implements helper methods related to sorting.
 */
public class SortUtility {
    /**
     * This method swaps the values of an array with given indices.
     */
    public static void swap(int[] arr, int firstIndex, int secondIndex){
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }
}
