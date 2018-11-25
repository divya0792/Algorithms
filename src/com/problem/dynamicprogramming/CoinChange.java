package com.problem.dynamicprogramming;

/**
 * You are given coins of different denominations and a total amount of money amount.
 * Write a function to compute the fewest number of coins that you need to make up that amount.
 * If that amount of money cannot be made up by any combination of the coins, return -1.
 *
 * Example 1:
 *
 * Input: coins = [1, 2, 5], amount = 11
 * Output: 3
 * Explanation: 11 = 5 + 5 + 1
 * Example 2:
 *
 * Input: coins = [2], amount = 3
 * Output: -1
 * Note:
 * You may assume that you have an infinite number of each kind of coin.
 */
public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        // create an array of size amount + 1. Extra 1 for calculating number of coins when amount = 0
        int[] dp = new int[amount + 1];

        // Initialize the array with max value of int which means no combination of coins can sum upto the amount
        for(int j = 1; j <= amount; j++) {
            dp[j] = Integer.MAX_VALUE;
        }

        for(int i = 1; i <= coins.length; i++) {
            for(int j = 1; j <= amount; j++) {
                // if the value of coin is less than or equal to the amount required
                if(coins[i - 1] <= j) {
                    // to select min number of coins we can either make up the amount by taking ith coin and picking
                    // number of coins at amount - value of ith coin
                    if(dp[j - coins[i - 1]] == Integer.MAX_VALUE) {
                        // if the min number of coins at amount - value of ith coin is max value of int then it means no
                        // combination can make up the ith amount too.
                        dp[j] = Math.min(Integer.MAX_VALUE, dp[j]);
                    } else {
                        dp[j] = Math.min(1 + dp[j - coins[i - 1]], dp[j]);
                    }
                }
            }
        }

        return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
    }
}
