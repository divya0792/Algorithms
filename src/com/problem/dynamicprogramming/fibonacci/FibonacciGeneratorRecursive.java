package com.problem.dynamicprogramming.fibonacci;

public class FibonacciGeneratorRecursive {

    public int generateFibonacci(int n) {
        if(n < 2) {
            return n;
        }

        return generateFibonacci(n - 1) + generateFibonacci(n - 2);
    }

}
