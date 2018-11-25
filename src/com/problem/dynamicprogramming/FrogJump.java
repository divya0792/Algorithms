package com.problem.dynamicprogramming;

/**
 * Given an array of integers where each element represents the max number of steps that can be made forward
 * from that element. Write a function to return the minimum number of jumps to reach the end of the array
 * (starting from the first element). If an element is 0, then cannot move through that element.
 *
 * Example:
 *
 * Input: arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9}
 * Output: 3 (1-> 3 -> 8 ->9)
 * First element is 1, so can only go to 3. Second element is 3, so can make at most 3 steps eg to 5 or 8 or 9.
 */
public class FrogJump {

    public static int minJump(int[] steps) {
        // initialize a dp array with length same as that of steps. This will keep min number of steps required to reach
        // at a particular position.
        int[] dp = new int[steps.length];

        // initialize elements with max value of int which implies that we cannot jump to that element/place.
        for(int i = 1; i < steps.length; i++) {
            dp[i] = Integer.MAX_VALUE;
        }

        for(int i = 0; i < steps.length - 1; i++) {
            // jth iteration will run only steps[i] times and start from next position of i , also ensure that j does
            // not cross last element
            for(int j = i + 1; j <= i + steps[i] && j < steps.length; j++) {

                // keep calculating the min number of steps required to reach at jth position by comparing the steps
                // already present at jth position and considering the current step and steps required to reach current
                // step. If the steps required to reach at current position is max value of int , it means it is not
                // possible to reach jth position too.
                if(dp[i] != Integer.MAX_VALUE) {
                    dp[j] = Math.min(dp[j], 1 + dp[i]);
                }
            }
        }
        // if the last step is max value of int , it means we cant reach the last step so return -1.
        return dp[steps.length - 1] == Integer.MAX_VALUE ? -1 : dp[steps.length - 1];
    }

    public static void main(String[] args) {
        int[] steps = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        System.out.println(minJump(steps));
    }
}
