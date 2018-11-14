package com.problem.dynamicprogramming.fibonacci;

import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciGeneratorTabularTest {

    @Test
    public void generateFibonacciTest() {
        //Arrange
        long nanos = System.nanoTime();
        FibonacciGeneratorTabular fib = new FibonacciGeneratorTabular();

        //Act
        int expectedResult = fib.generateFibonacci(30000);

        System.out.println((System.nanoTime() - nanos) / Math.pow(10, 6));

        //Assert
        //assertEquals(expectedResult, 21);

    }

}