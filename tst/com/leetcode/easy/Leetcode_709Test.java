package com.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class Leetcode_709Test {

    @Test
    public void toLowerCase() {
        //Arrange
        Leetcode_709 leet = new Leetcode_709();
        String s = "HeLl8";

        //Act
        String actual = leet.toLowerCase(s);

        assertEquals(actual, s.toLowerCase());

    }
}