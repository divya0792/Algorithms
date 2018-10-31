package com.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class Leetcode_804Test {

    @Test
    public void uniqueMorseRepresentations() {
        //Arrange
        Leetcode_804 leet = new Leetcode_804();
        String[] words = {"gin", "zen", "gig", "msg"};

        //Act
        int actualDiff = leet.uniqueMorseRepresentations(words);

        //assert
        assertEquals(actualDiff, 2);

    }
}