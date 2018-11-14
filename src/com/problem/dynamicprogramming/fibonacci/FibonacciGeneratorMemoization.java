package com.problem.dynamicprogramming.fibonacci;

import java.util.Map;
import java.util.HashMap;

public class FibonacciGeneratorMemoization {

    public int generateFibonacci(int n) {
        if(n < 0) {
            throw new IllegalArgumentException("input cannot be negative");
        }
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,0);
        map.put(1,1);
        return helper(n, map);
    }

    private int helper(int n, Map<Integer, Integer> map) {
        if(!map.containsKey(n)) {
            int fib = helper(n - 1, map) + helper(n - 2, map);
            map.put(n, fib);
        }
        return map.get(n);
    }

}
