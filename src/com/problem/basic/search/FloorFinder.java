package com.problem.basic.search;

public class FloorFinder {
    /**
     * We assume that the array is sorted.
     */
    public int findFloorValue(int[] arr, int key) {
       return findFloorValue(arr, 0, arr.length -1, key);
    }

    private int findFloorValue(int[] arr, int low, int high, int key) {
        if (low > high) {
            return -1;
        }
        if (key >= arr[high]) {
            return arr[high];
        }
        int mid = (low + high) / 2;
        if (mid + 1 <= arr.length - 1 && key < arr[mid + 1] && key >= arr[mid]) {
            return arr[mid];
        } else if (key < arr[mid]) {
            return findFloorValue(arr, low, mid - 1, key);
        } else {
            return findFloorValue(arr, mid + 1, high, key);
        }
    }
}
