package com.solutions;

public class distributeCandies {
    public int[] distributeCandies(int candies, int num_people) {
        int arr[] = new int[num_people];
        int i = 0;
        int given = 1;

        while (candies > 0) {
            if (candies >= given) {
                arr[i] += given;
                candies -= given;
                i++;
                given++;
            } else {
                arr[i] += candies;
                candies = 0;
            }

            if (i == num_people) {
                i = 0;
            }
        }
        return arr;
    }

}
