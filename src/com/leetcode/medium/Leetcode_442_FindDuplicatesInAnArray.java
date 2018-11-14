package com.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_442_FindDuplicatesInAnArray {

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();

        int counter = nums.length;
        for(int i = 0; i < nums.length; i++) {
            while (i + 1 != nums[i] && counter >= 0) {
                if (nums[nums[i] - 1] != nums[i]) {
                    swap(i, nums[i] - 1, nums);
                    counter--;
                } else break;
            }
        }

        int val = 1;
        for(int num : nums) {
            if(num != val) {
                list.add(num);
            }
            val++;
        }
        return list;
    }

    private static void swap(int first, int second, int[] nums) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
