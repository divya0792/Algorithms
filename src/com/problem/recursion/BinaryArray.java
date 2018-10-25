package com.problem.recursion;

public class BinaryArray {
    public void generateArray(int size) {
        int[] result = new int[size];
        generateArray(result, 0) ;
    }

    private void generateArray(int[] result, int current) {
        if(current == result.length) {
            printArray(result);
            return;
        }
        for(int i = 0; i < 2; i++) {
            result[current] = i;
            generateArray(result, current + 1);
        }
    }

    private void printArray(int[] result) {
        for(int num : result) {
            System.out.print(num);
        }
        System.out.println();
    }
}
