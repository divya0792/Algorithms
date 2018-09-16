package com.util.basic.search;

/**
 * This Class implements binarySearch iteratively.
 * The aim is to find if an integer is present in a sorted array and return its index.
 * It splits the array into 2 halves and compares the key with middle number and finds
 * the key in either left half or right half depending on the comparision output.
 * space complexity = O(1)
 * time complexity = O(log n) for worst case
 *
 */

public class BinarySearchIterative {

    public int search(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        while(low <= high) {
            int mid = (low + high)/2;
            if(key == arr[mid]) {
                return mid;
            }
            else if(key < arr[mid]) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }

        }
        return -1;
    }
}
