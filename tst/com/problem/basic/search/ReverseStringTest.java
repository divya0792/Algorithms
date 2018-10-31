package com.problem.basic.search;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReverseStringTest {

    @Test
    public void reverseString() {
        //Arrange
        String str = "reverseThisString";
        StringBuilder stringBuilder = new StringBuilder(str);
        String expectedString = stringBuilder.reverse().toString();
        ReverseString reverseAString = new ReverseString();

        //Act
        String actualString = reverseAString.reverse(str);

        //Assert
        assertEquals(expectedString, actualString);
    }



}