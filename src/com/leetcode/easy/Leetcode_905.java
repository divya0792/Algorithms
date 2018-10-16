package com.leetcode.easy;

public class Leetcode_905 {

    public int[] sortArrayByParity(int[] arr) {
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            if (arr[i] % 2 != 0 && arr[j] % 2 == 0) {
                swap(i, j, arr);
                i++;
                j--;
            } else if (arr[i] % 2 == 0) {
                i++;
            } else {
                j--;
            }
        }
        return arr;
    }

    private void swap(int firstIndex, int secondIndex, int[] arr) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }

}
