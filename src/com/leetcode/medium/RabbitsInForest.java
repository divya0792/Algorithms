package com.leetcode.medium;

import java.util.Arrays;

public class RabbitsInForest {
    public static int numRabbits(int[] answers) {
        Arrays.sort(answers);
        int start = 0;
        int end = answers.length;
        int totalCount = 0;

        while(start < end) {
            int dup = start + 1;
            while(dup < answers.length && answers[start] > 0 && answers[start] == answers[dup] && dup <= start + answers[start]) {
                dup++;
            }
            totalCount += answers[start] + 1;
            start = dup;
        }

        return totalCount;
    }
}
