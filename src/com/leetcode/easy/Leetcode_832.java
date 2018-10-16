package com.leetcode.easy;

public class Leetcode_832 {
    public int[][] flipAndInvertImage(int[][] A) {
        if (A == null) {
            throw new IllegalArgumentException("A is null");
        }
        if (A.length == 0) {
            return A;
        }
        for (int i = 0; i < A.length; i++) {
            A[i] = reverse(A[i]);
        }

        return A;
    }


    private int[] reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int temp = invert(arr[start]);
            arr[start] = invert(arr[end]);
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }


    private int invert(int value) {
        if(value == 0) {
            return 1;
        }
        return 0;
    }
}
