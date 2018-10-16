package com.leetcode.easy;

public class Leetcode_461 {
    public int hammingDistance(int x, int y) {
        String strX = calculateBinary(x);
        String strY = calculateBinary(y);

        String biggerStr = strX.length() >= strY.length() ? strX : strY;
        String smallerStr = strX.length() < strY.length() ? strX : strY;
        int counter = 0;

        for(int i = 0; i < biggerStr.length() ; i++) {
            if(i < smallerStr.length() && biggerStr.charAt(i) != smallerStr.charAt(i)) {
                counter++;
            } else if(i >= smallerStr.length() && biggerStr.charAt(i) != '0') {
                counter++;
            }
        }
        return counter;

    }

    public int hammingDistanceBit(int x, int y) {
        return Integer.bitCount(x ^ y);
    }


    private String calculateBinary(int n) {
        String str = "";
        while(n > 0) {
            str += n % 2;
            n = n / 2;
        }
        return str;
    }
}
