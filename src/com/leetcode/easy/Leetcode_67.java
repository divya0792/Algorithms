package com.leetcode.easy;

public class Leetcode_67 {
    public String addBinary(String a, String b) {

        StringBuilder result = new StringBuilder();
        String biggerString;
        String smallerString;
        if(a.length() - b.length() > 0) {
            biggerString = a;
            smallerString = b;
        } else {
            biggerString = b;
            smallerString = a;
        }

        int sum, carrySum, smallVal, carry = -1;
        int smallerCounter = smallerString.length() - 1;
        int biggerCounter = biggerString.length() - 1;
        while(biggerCounter > -1) {
            carrySum = Character.getNumericValue(biggerString.charAt(biggerCounter));
            if(carry != -1) {
                carrySum = carrySum + carry;
                if(carrySum == 2) {
                    carrySum = 0;
                } else {
                    carry = -1;
                }
            }
            if(smallerCounter < 0) {
                smallVal = 0;
            } else {
                smallVal = Character.getNumericValue(smallerString.charAt(smallerCounter));
            }

            sum = carrySum + smallVal;
            if(sum == 2) {
                sum = 0;
                carry = 1;
            }
            result.append(sum);
            biggerCounter--;
            smallerCounter--;
        }
        if(carry == 1) {
            result.append(carry);
        }

        return result.reverse().toString();
    }

    public static void main(String args[]) {
        Leetcode_67 leet = new Leetcode_67();
        leet.addBinary("11", "1");
    }
}

