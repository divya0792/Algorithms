package com.leetcode.easy;

public class Leetcode_389_FindTheDifference {
    public char findTheDifference(String s, String t) {
        char diff = '\0';
        if(s == null || t == null) {
            return diff;
        }
        int[] charArray = new int[26];
        int length = s.length() - 1;
        for(int i = 0; i < length; i++) {
            charArray[s.charAt(i) - 'a'] = charArray[s.charAt(i) - 'a'] + 1;
            charArray[t.charAt(i) - 'a'] = charArray[t.charAt(i) - 'a'] - 1;
        }
        charArray[t.charAt(length + 1) - 'a'] = charArray[t.charAt(length + 1) - 'a'] - 1;

        for(int i = 0; i <= 26; i++) {
            if(charArray[i] < 0) {
                diff =  (char)(i + 'a');
                break;
            }
        }
        return diff;
    }
}
