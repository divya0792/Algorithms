package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_728 {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> nums = new ArrayList<>();

        for(int i = left; i <= right; i++) {
           if(selfDividingNumber(i)) {
               nums.add(i);
           }
        }
        return nums;
    }


    private boolean selfDividingNumber(int num) {
        int number = num;
        if(num / 10 == 0) {
            return true;
        }

        while(number / 10 != 0) {
            if(number % 10 == 0) {
                return false;
            } else if(num /(number % 10) != 0) {
                return false;
            }
            number = number / 10;
        }
        return true;
    }
}
