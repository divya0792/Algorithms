package com.util.basic.sort;

/**
 * This class implements bubble sort algorithm in ascending order.
 * This method bubbles through each element till the greatest element is pushed to right.
 * space complexity = O(1)
 * time complexity = O(n^2)
 */
public class BubbleSort {
    public void sort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length - 1 - i; j++){
                if(arr[j] > arr[j + 1]){
                    SortUtility.swap(arr, j, j + 1);
                }
            }
        }
    }
}
