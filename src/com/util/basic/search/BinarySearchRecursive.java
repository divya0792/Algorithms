package com.util.basic.search;

/**
 * This class implements binary search using recursion
 * The aim is to find index of an integer if it is present in a sortedArray.
 * This method compares the given integer with mid value of an array and searches recursively in either left or right half
 * depending on the result of comparision.
 * Space Complexity = O(1)
 * Time complexity = O(log n)
 *
 */
public class BinarySearchRecursive {

    public int search(int[] arr, int key) {
       return search(arr, 0, arr.length - 1, key);
    }

    private int search(int[] arr, int low, int high, int key) {
        if (low <= high) {
            int mid = (low + high) / 2;
            if (key == arr[mid]) {
                return mid;
            } else if (key < arr[mid]) {
                return search(arr, low, mid - 1, key);
            } else {
                return search(arr, mid + 1, high, key);
            }
        }
            return -1;
    }
}
