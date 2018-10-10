package com.util.basic.sort;

public class HeapSort {

    public void sort(int[] arr) {
        if(arr == null) {
            throw new IllegalArgumentException("input array cannot be null");
        }
        int heapSize = arr.length - 1;

        makeSmallHeaps(arr, heapSize);
        for(int i = heapSize; i > 0; i--) {
            SortUtility.swap(arr, 0, heapSize);
            heapSize--;
            sink(0, heapSize, arr);
        }
    }

    private void makeSmallHeaps(int[] arr, int heapSize) {
        for(int i = (heapSize - 1) / 2; i >= 0; i--) {
            int biggerChild = findBiggerChild(2 * i + 1, 2 * i + 2, heapSize, arr);
            if(arr[i] < arr[biggerChild]){
                SortUtility.swap(arr, i, biggerChild);
                sink(biggerChild, heapSize, arr);
            }
        }
    }

    private void sink(int k, int heapSize, int[] arr) {
        while(2 * k + 1 <= heapSize) {
            int biggerChild = findBiggerChild(2 * k + 1, 2 * k + 2 , heapSize, arr);
            if(arr[k] < arr[biggerChild]) {
                SortUtility.swap(arr, k, biggerChild);
                k = biggerChild;
            } else {
                break;
            }
        }
    }

    private int findBiggerChild(int i, int j, int heapSize, int[] arr) {
        if(j > heapSize || arr[i] >= arr[j]) {
            return i;
        } else {
            return j;
        }
    }
}
