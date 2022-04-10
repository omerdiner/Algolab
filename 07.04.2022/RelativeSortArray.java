package com.solutions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class RelativeSortArray {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int ans[] = new int[arr1.length];
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        int k = 0;

        for (int i : arr1) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int i : arr2) {
            set.add(i);
        }

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < map.get(arr2[i]); j++) {
                ans[k] = arr2[i];
                k++;
            }
            map.remove(arr2[i]);
        }

        int left[] = new int[arr1.length - k];
        int m = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet())
            for (int i = 0; i < entry.getValue(); i++) {
                left[m] = entry.getKey();
                m++;
            }
        Arrays.sort(left);

        int i = 0;
        while (k < ans.length) {
            ans[k] = left[i];
            i++;
            k++;
        }
        return ans;

    }
}
