package com.problem.dynamicprogramming.fibonacci;

/**
 * Generate fibonacci number.
 */
public class FibonacciGeneratorRecursive {

    public int generateFibonacci(int n) {
        // if the number is less than 2 then return same number because fibonacci of 0
        // is 0 and 1 is 1.
        if(n < 2) {
            return n;
        }
        // add previous two numbers in fibonacci series.
        return generateFibonacci(n - 1) + generateFibonacci(n - 2);
    }

}
