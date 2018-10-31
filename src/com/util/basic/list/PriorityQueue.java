package com.util.basic.list;

public class PriorityQueue {
    private final int[] arr;
    private int heapSize;

    PriorityQueue(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("size cannot be 0 or negative");
        }
        arr = new int[size + 1];
        heapSize = 0;
    }

    public void insert(int key) {
        if(heapSize == arr.length - 1) {
            throw new IllegalStateException("cant insert more elements");
        }
        heapSize++;
        arr[heapSize] = key;
        swim(heapSize);
    }

    public boolean isEmpty() {
        return heapSize == 0;
    }

    public int delMax() {
        if(heapSize == 0) {
            throw new IllegalStateException("queue is empty");
        }
        int maxVal = arr[1];
        arr[1] = arr[heapSize];
        arr[heapSize] = 0;
        heapSize--;
        sink(1);
        return maxVal;
    }

    private void swim(int k) {
        while(k > 1) {
            if (arr[k] > arr[k / 2]) {
                swap(k, k / 2);
                k = k / 2;
            } else {
                break;
            }
        }
    }

    private void sink(int k) {
        while(2 * k <= heapSize) {
           int res = findBiggerChild(2 * k, 2 * k + 1);
           if(arr[k] < arr[res]) {
               swap(k, res);
               k = res;
           } else {
               break;
           }
        }
    }

    private int findBiggerChild(int firstChild, int secondChild) {
        if(secondChild > heapSize || arr[firstChild] >= arr[secondChild]) {
            return firstChild;
        } else {
            return secondChild;
        }
    }

    private void swap(int firstIndex, int secondIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }
}
