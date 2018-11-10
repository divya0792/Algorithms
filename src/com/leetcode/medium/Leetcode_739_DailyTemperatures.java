package com.leetcode.medium;

import java.util.Stack;

public class Leetcode_739_DailyTemperatures {
    public int[] dailyTemperatures(int[] T) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[T.length];
        stack.push(0);

        for (int i = 1; i < T.length; i++) {
            while (!stack.isEmpty() && T[stack.peek()] < T[i]) {
                int index = stack.peek();
                stack.pop();
                result[index] = i - index;
            }
            stack.push(i);

        }

        return result;
    }
}
