package com.solutions;

import java.util.HashMap;

public class NumberofPairsofStringsWithConcatenationEqualtoTarget {
    public int numOfPairs(String[] nums, String target) {
        int pairs = 0;
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : nums) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        for (String s : nums) {
            if (target.startsWith(s)) {
                String search = target.substring(s.length());
                if (map.containsKey(search)) {
                    pairs += map.get(search);

                    if (s.equals(search)) {
                        pairs--;
                    }

                }
            }
        }
        return pairs;
    }
}
