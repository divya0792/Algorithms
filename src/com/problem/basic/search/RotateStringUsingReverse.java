package com.problem.basic.search;

public class RotateStringUsingReverse {

    public String rotate(String str, int numberOfRotation) {
        int breakIndex = str.length() - numberOfRotation;
        ReverseString reverseString = new ReverseString();
        str = reverseString.reverse(str.substring(breakIndex)) + str.substring(0,breakIndex);
        return str;
    }
    public String rotateFull(String str, int numberOfRotation) {
        ReverseString reverseString = new ReverseString();
        str = reverseString.reverse(str);
        str = reverseString.reverse(str.substring(0, numberOfRotation)) +
                reverseString.reverse(str.substring(numberOfRotation));
        return str;
   }

}
