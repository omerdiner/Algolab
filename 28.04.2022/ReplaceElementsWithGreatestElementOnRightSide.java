package com.solutions;

public class ReplaceElementsWithGreatestElementOnRightSide {
    public int[] replaceElements(int[] arr) {
        int l = arr.length - 1;

        int max = arr[l];

        arr[l] = -1;

        if (l != 0) {

            for (int i = l - 1; i > -1; i--) {
                int tmp = arr[i];
                arr[i] = max;

                if (tmp > max)
                    max = tmp;
            }
        } else {
            return arr;
        }
        return arr;
    }
}
