package com.solutions;

public class FlippingAnImage {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            reverseRow(image, i);
        }
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                if (image[i][j] == 0)
                    image[i][j] = 1;
                else
                    image[i][j] = 0;
            }
        }
        return image;
    }

    public void reverseRow(int[][] image, int i) {
        int start = 0;
        int end = image[i].length - 1;

        while (start < end) {
            int tmp = image[i][start];
            image[i][start] = image[i][end];
            image[i][end] = tmp;

            end--;
            start++;
        }
    }
}
