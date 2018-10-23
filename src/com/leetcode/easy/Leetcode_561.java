package com.leetcode.easy;

import java.util.Arrays;

public class Leetcode_561 {
    public int arrayPairSum(int[] nums) {
        if(nums == null) {
            throw new IllegalArgumentException("input is null");
        }
        if(nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int sum = 0;
        for(int i = 0; i < nums.length - 1; i = i + 2) {
            sum += Math.min(nums[i], nums[i + 1]);
        }
        return sum;
    }

}
