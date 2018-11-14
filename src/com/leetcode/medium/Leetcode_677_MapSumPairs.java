package com.leetcode.medium;

import java.util.Map;
import java.util.HashMap;

public class Leetcode_677_MapSumPairs {

    Map<String,Integer> map;
    Map<String,Integer> inserts;

    public Leetcode_677_MapSumPairs() {
        map = new HashMap<>();
        inserts = new HashMap<>();
    }

    public void insert(String key, int val) {
        if(!inserts.containsKey(key)) {
            for(int i = 1; i <= key.length(); i++) {
                String sub = key.substring(0, i);
                if(map.containsKey(sub))
                    map.put(sub, map.get(sub) + val);
                else map.put(sub, val);
            }
        } else {
            for(int i = 1; i <= key.length(); i++) {
                String sub = key.substring(0, i);
                map.put(sub, map.get(sub) - inserts.get(key) + val);
            }
        }
        inserts.put(key, val);
    }

    public int sum(String prefix) {
        if(map.containsKey(prefix)) {
            return map.get(prefix);
        }
        return -1;
    }
}
