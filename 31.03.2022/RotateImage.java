package com.solutions;

public class RotateImage {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<i;j++){
                int tmp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=tmp;
            }
        }

        int start=0;
        int end=matrix.length-1;

        while(start<=end){
            exchangeTwoColumns(matrix,end,start);
            start++;
            end--;
        }
        System.out.println(matrix);


    }
    public static void exchangeTwoColumns(int[][] matrix,
                                          int K, int L)
    {
        for (int i = 0; i < matrix.length; i++) {

            int temp = matrix[i][K];
            matrix[i][K] = matrix[i][L];
            matrix[i][L] = temp;
        }

    }
}
