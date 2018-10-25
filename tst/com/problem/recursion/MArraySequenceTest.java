package com.problem.recursion;

import org.junit.Test;

import static org.junit.Assert.*;

public class MArraySequenceTest {

    private MArraySequence mArraySequence = new MArraySequence();
    @Test
    public void generateArrayForThree() {

        int size = 3;
        int numbers = 3;

        //Act
        mArraySequence.generateArray(size, numbers);
    }

    @Test
    public void generateArrayForFour() {
        //Arrange

        int size = 3;
        int numbers = 4;

        //Act
        mArraySequence.generateArray(size, numbers);
    }
}