package com.leetcode.easy;

public class Leetcode_922 {
    public int[] sortArrayByParityII(int[] A) {
        if(A == null) {
            throw new IllegalArgumentException("A is null");
        }
        if(A.length == 0) {
            return A;
        }

        int even = 0;
        int odd = 1;

        while(odd < A.length && even < A.length) {
            if (A[even] % 2 == 0) {
                even += 2;
            } else if (A[odd] % 2 != 0) {
                odd += 2;
            } else {
                swap(A, even, odd);
                even += 2;
                odd += 2;
            }
        }
        return A;
    }


    private void swap(int[] arr, int firstIndex, int secondIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }
}
