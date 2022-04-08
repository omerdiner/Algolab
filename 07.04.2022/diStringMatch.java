package com.solutions;

public class diStringMatch {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int arr[] = new int[n + 1];

        int start = 0, end = n;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'I') {
                arr[i] = start;
                start++;
            } else {
                arr[i] = end;
                end--;
            }
        }

        arr[n] = start;
        return arr;
    }


}
