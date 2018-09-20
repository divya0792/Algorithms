package com.problem.basic.search;
/**
 * Find a number in a sorted array which is greater than K
 */
public class GreaterThanK {

    public int search(int[] arr, int key) {
        return search(arr, 0, arr.length -1, key);
    }

    private int search(int[] arr, int low, int high, int key) {
        if(low > high) {
            return -1;
        }
        if(key < arr[low]) {
            return arr[low];
        }

        int mid = (low + high) / 2;
        if (key < arr[mid]) {
            if (mid - 1 >= 0 && key >= arr[mid - 1]) {
                return arr[mid];
            } else {
                return search(arr, low, mid - 1, key);
            }
        } else {
            return search(arr, mid + 1, high, key);
        }
    }
}
