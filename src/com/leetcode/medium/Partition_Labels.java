package com.leetcode.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Partition_Labels {
    public List<Integer> partitionLabels(String S) {
        List<Integer> res = new ArrayList<>();

        int[] count = new int[26];
        char[] arr = S.toCharArray();
        int length = arr.length;

        for(char c : arr) {
            count[c - 'a'] = count[c - 'a'] + 1;
        }

        Set<Character> used;
        int start = 0;
        int partition;

        while(start < length) {
            partition = 0;
            used = new HashSet<>();

            used.add(arr[start]);
            count[arr[start] - 'a'] -= 1;
            partition++;


            while(!used.isEmpty()) {
                char c = used.iterator().next();
                while(count[c - 'a'] != 0) {
                    start++;
                    used.add(arr[start]);
                    count[arr[start] - 'a'] -= 1;
                    partition++;
                }
                used.remove(c);
            }
            start++;
            res.add(partition);
        }

        return res;
    }

    public static void main(String[] args) {
        String S = "ababcbaca defegde hijhklij";
        Partition_Labels labels = new Partition_Labels();
        labels.partitionLabels(S);
    }
}
