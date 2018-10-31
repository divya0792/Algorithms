package com.util.basic.list;

import java.util.EmptyStackException;

public class StackUsingArray {
    private int index = 0;
    private int[] arr;

    public StackUsingArray() {
        arr = new int[10];
    }

    public void push(int data) {
        if(index + 1 > arr.length) {
            arr = resizeArray(arr.length * 2);
        }
        arr[index++] = data;
    }

    public int pop() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        return arr[index--];
    }

    public boolean isEmpty() {
        return index == 0;
    }

    public int size() {
        return index;
    }

    public int[] toArray(){
        int[] returnArr = new int[size()];
        for(int i = 0; i < size(); i++) {
            returnArr[i] = arr[i];
        }
        return returnArr;
    }

    private int[] resizeArray(int newLength) {
        int[] resizedArr = new int[newLength];
        for(int i = 0; i < arr.length; i++) {
            resizedArr[i] = arr[i];
        }
        return resizedArr;
    }
}
