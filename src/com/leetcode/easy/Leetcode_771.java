package com.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * You're given strings J representing the types of stones that are jewels, and S representing the stones you have.
 * Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.
 *
 * The letters in J are guaranteed distinct, and all characters in J and S are letters.
 * Letters are case sensitive, so "a" is considered a different type of stone from "A".
 *
 * Example 1:
 * Input: J = "aA", S = "aAAbbbb"
 * Output: 3
 * Example 2:
 * Input: J = "z", S = "ZZ"
 * Output: 0
 * S and J will consist of letters and have length at most 50.
 * The characters in J are distinct.
 */
public class Leetcode_771 {

    public int findJewelsBruteForce(String J, String S) {
        if(J == null) {
            throw new IllegalArgumentException("J is null");
        }
        if(S == null) {
            throw new IllegalArgumentException("S is null");
        }
        if(J.length() == 0 || S.length() == 0) {
            return 0;
        }
        int counter = 0;
        for(int i = 0; i < J.length(); i++) {
            for(int j = 0; j < S.length(); j++) {
                if(J.charAt(i) == S.charAt(j)) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public int findJewels(String J, String S) {
        if(J == null) {
            throw new IllegalArgumentException("J is null");
        }
        if(S == null) {
            throw new IllegalArgumentException("S is null");
        }
        if(J.length() == 0 || S.length() == 0) {
            return 0;
        }
        int counter = 0;
        Set<Character> setJ = new HashSet<>();
        for(int i = 0; i < J.length(); i++) {
            setJ.add(J.charAt(i));
        }
        for(int j = 0; j < S.length(); j++) {
            if(setJ.contains(S.charAt(j))){
                counter++;
            }
        }
        return counter;

    }

}
