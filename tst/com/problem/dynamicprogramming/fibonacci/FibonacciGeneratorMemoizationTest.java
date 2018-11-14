package com.problem.dynamicprogramming.fibonacci;

import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciGeneratorMemoizationTest {

    @Test
    public void generateFibonacci() {
        //Arrange
        long nanos = System.nanoTime();
        FibonacciGeneratorMemoization fib = new FibonacciGeneratorMemoization();

        //Act
        int expectedResult = fib.generateFibonacci(30000);

        System.out.println((System.nanoTime() - nanos) / Math.pow(10, 6));

        //assertEquals(21, expectedResult);

    }
}