package com.problem.basic.search;

public class RotateString {
    public String rotate(String str, int numberOfRotation) {
        if(str == null) {
            throw new IllegalArgumentException("String cannot be null");
        }
        if(numberOfRotation < 0) {
            throw new IllegalArgumentException("number of rotation cannot be negative");
        }
        char[] toCharArray = str.toCharArray();
        int start = 1;
        while(start <= numberOfRotation) {
            rotateOnce(toCharArray);
            start++;
        }
        return new String(toCharArray);
    }

    private void rotateOnce(char[] arr) {
        int end = arr.length - 1;
        char temp = arr[end];
        while(end >= 1) {
            arr[end] = arr[end - 1];
            end--;
        }
        arr[end] = temp;
    }
}
