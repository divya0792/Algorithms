package com.leetcode.medium;

public class Leetcode_300_LongestIncreasingSubsequence {
    public static int lengthOfLIS(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        int length = nums.length;
        int[] subLen = new int[length];
        int maxLen = 1;

        for(int i = 0; i < length; i++) {
            for(int j = 0; j < i; j++) {
                if(nums[j] <= nums[i]) {
                    subLen[i] = Math.max(subLen[j] + 1, subLen[i]);
                }
            }
            maxLen = Math.max(subLen[i] + 1, maxLen);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums = {7,2,9,3,-1,4,5,11};
        lengthOfLIS(nums);
    }
}
