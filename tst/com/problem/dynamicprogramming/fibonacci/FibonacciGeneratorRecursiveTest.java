package com.problem.dynamicprogramming.fibonacci;

import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciGeneratorRecursiveTest {

    @Test
    public void generateFibonacci() {
        //Arrange
        long nanos = System.nanoTime();
        FibonacciGeneratorRecursive fib = new FibonacciGeneratorRecursive();

        //Act
        int expectedResult = fib.generateFibonacci(42);
        System.out.println((System.nanoTime() - nanos) / Math.pow(10,6));

        //assertEquals(21, expectedResult);

    }
}