package com.leetcode.medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Leetcode_939_MinAreaRectangle {

    public int minAreaRect(int[][] points) {
        Map<Integer, Set<Integer>> map = new HashMap<>();

        for(int[] point : points) {
            if(!map.containsKey(point[0])) {
                map.put(point[0], new HashSet<>());
            }
            map.get(point[0]).add(point[1]);
        }

        int minArea = Integer.MAX_VALUE;
        for(int[] point1 : points) {
            for(int[] point2 : points) {
                if(point1[0] == point2[0] || point1[1] == point2[1]) {
                    continue;
                }

                if(map.get(point1[0]).contains(point2[1]) && map.get(point2[0]).contains(point1[1])) {
                    minArea = Math.min(minArea, Math.abs(point1[0] - point2[0]) * Math.abs(point1[1] - point2[1]));
                }
            }
        }

        if(minArea == Integer.MAX_VALUE) {
            minArea = 0;
        }

        return minArea;
    }
}
