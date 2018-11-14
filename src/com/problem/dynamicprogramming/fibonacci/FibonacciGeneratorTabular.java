package com.problem.dynamicprogramming.fibonacci;

public class FibonacciGeneratorTabular {
    public int generateFibonacci(int n) {
        if(n < 0) {
            throw new IllegalArgumentException("input cannot be negative");
        }
        int[] fibSeries = new int[n + 1];
        fibSeries[0] = 0;
        fibSeries[1] = 1;

        for(int i = 2; i <= n; i++) {
            fibSeries[i] = fibSeries[i - 1] + fibSeries[i - 2];
        }

        return fibSeries[n];
    }
}
