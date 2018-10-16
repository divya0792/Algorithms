package com.leetcode.easy;
/**
 * Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.
 */
public class Leetcode_709 {
    public String toLowerCase(String str) {
        if(str == null) {
            throw new IllegalArgumentException("str is null");
        }
        if(str.length() == 0) {
            return str;
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
                result.append((char) (str.charAt(i) + 32));
            } else {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }
}
