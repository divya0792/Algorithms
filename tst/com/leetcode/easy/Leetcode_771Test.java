package com.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Leetcode_771Test {

    @Test
    public void findJewelsBruteForce() {
        //Arrange
        String J = "aA";
        String S = "bbameramA";
        Leetcode_771 leet = new Leetcode_771();

        //Act
        int actual = leet.findJewelsBruteForce(J, S);

        //Assert
        assertEquals(actual, 3);
    }

    @Test
    public void findJewels() {
        //Arrange
        String J = "aA";
        String S = "bbameramA";
        Leetcode_771 leet = new Leetcode_771();

        //Act
        int actual = leet.findJewels(J, S);

        //Assert
        assertEquals(actual, 3);
    }
}