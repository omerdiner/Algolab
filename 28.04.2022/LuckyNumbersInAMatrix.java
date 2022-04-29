package com.solutions;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumbersInAMatrix {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == minInRow(matrix, i) && matrix[i][j] == maxInColumn(matrix, j)) {
                    list.add(matrix[i][j]);
                }
            }
        }

        return list;
    }

    public int minInRow(int[][] a, int r) {
        int min = a[r][0];
        for (int i = 1; i < a[r].length; i++) {
            if (a[r][i] < min) {
                min = a[r][i];
            }
        }
        return min;
    }

    public int maxInColumn(int[][] a, int c) {
        int max = a[0][c];
        for (int i = 1; i < a.length; i++) {
            if (a[i][c] > max) {
                max = a[i][c];
            }
        }
        return max;
    }
}
