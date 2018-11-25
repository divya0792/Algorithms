package com.problem.dynamicprogramming.fibonacci;

import java.util.Map;
import java.util.HashMap;

/**
 * Generate fibonacci number.
 * fib(n) = fib(n - 1) + fib(n - 2)
 * This uses dynamic programming by storing fibonacci numbers
 */
public class FibonacciGeneratorMemoization {

    public int generateFibonacci(int n) {
        if(n < 0) {
            throw new IllegalArgumentException("input cannot be negative");
        }
        // create a map which whose key will have value as its fibonacci number.
        Map<Integer, Integer> map = new HashMap<>();
        // putting initial fibonacci numbers
        map.put(0,0);
        map.put(1,1);
        return helper(n, map);
    }

    private int helper(int n, Map<Integer, Integer> map) {
        // if map doesn't contain a number then generate by adding previous two fibonacci numbers which are
        // already present in map and store the current fib number so that it can be used for numbers greater than n.
        if(!map.containsKey(n)) {
            int fib = helper(n - 1, map) + helper(n - 2, map);
            map.put(n, fib);
        }
        return map.get(n);
    }

}
