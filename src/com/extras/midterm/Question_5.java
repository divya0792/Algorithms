package com.extras.midterm;
import java.util.Stack;

/*
Given an array print the next greater element for every element. For example given array [6,8,2,34]

Element   Next Greater Element
 6      ->   8
 8      ->   34
 2      ->   34
 34     ->   int.Minimum
 */
public class Question_5 {

    public void printGreaterElement(int[] arr) {
        if(arr == null) {
            System.out.println("array is null");
            return;
        }
        int[] greaterElementArray = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for(int i = 1; i < arr.length; i++) {
            while(!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                int index = stack.pop();
                greaterElementArray[index] = arr[i];
            }
            stack.push(i);
        }

        while(!stack.isEmpty()) {
            int index = stack.pop();
            greaterElementArray[index] = Integer.MIN_VALUE;
        }

        for(int num : greaterElementArray) {
            System.out.print(num + " , ");
        }
    }

    public static void main(String[] args) {
        Question_5 question = new Question_5();
        int[] arr = {9,23,5,0,12,56,78};
        question.printGreaterElement(arr);
    }
}
