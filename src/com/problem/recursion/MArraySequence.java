package com.problem.recursion;

public class MArraySequence {
    public void generateArray(int size, int numbers) {
        int[] result = new int[size];
        generateArray(result, numbers, 0);

    }

    private void generateArray(int[] result, int numbers, int current) {
        if(current == result.length) {
            printArray(result);
            return;
        }

        for(int i = 0; i < numbers; i++) {
            result[current] = i;
            generateArray(result, numbers, current + 1);
        }
    }

    private void printArray(int[] result) {
        for(int num : result) {
            System.out.print(num);
        }
        System.out.println();
    }
}
