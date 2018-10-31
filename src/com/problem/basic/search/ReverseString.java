package com.problem.basic.search;

public class ReverseString {
    public String reverse(String str) {
        char[] strToCharArray = str.toCharArray();
        int start = 0;
        int end = str.length() - 1;
        while(start < end) {
            swap(strToCharArray, start, end);
            start++;
            end--;
        }
        return new String(strToCharArray);
    }

    private void swap(char[] arr, int firstIndex, int secondIndex){
        char temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }




}
