package com.problem.basic.list;

import com.util.basic.list.SingleLinkedList;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeCheckerTest {

    @Test
    public void check() {

        //Arrange
        int[] arr = {1,2,3,4,5,7,4,3,2,1};
        int start = 0;
        int end = arr.length - 1;
        boolean isPalindromeExpected = true;
        while(start < end) {
            if(arr[start] != arr[end]) {
                isPalindromeExpected = false;
                break;
            }
            start++;
            end--;
        }
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        for (int anArr : arr) {
            singleLinkedList.add(anArr);
        }

        //Act
        boolean isPalindromeActual = palindromeChecker.isPalindrome(singleLinkedList);

        //Assert
        assertEquals(isPalindromeExpected, isPalindromeActual);

    }
}