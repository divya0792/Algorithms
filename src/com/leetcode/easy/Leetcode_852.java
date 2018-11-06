package com.leetcode.easy;

public class Leetcode_852 {

    public int peakIndexInMountainArray(int[] A) {
        if(A == null || A.length < 3) {
            return -1;
        }
        return findPeak(A, 0, A.length - 1);


    }
    private int findPeak(int[] A, int low, int high) {
        if(low > high) {
            return -1;
        }
        int mid = (low + high) / 2;

        if(A[mid - 1] < mid && A[mid + 1] < A[mid]) {
            return mid;
        } else if(A[mid - 1] > A[mid]) {
            return findPeak(A, low, mid - 1);
        } else {
            return findPeak(A, mid + 1, high);
        }

    }

    public static void main(String args[]) {
        Leetcode_852 leet = new Leetcode_852();
        int[] A = {3,4,5,1};
        leet.peakIndexInMountainArray(A);
    }
}
