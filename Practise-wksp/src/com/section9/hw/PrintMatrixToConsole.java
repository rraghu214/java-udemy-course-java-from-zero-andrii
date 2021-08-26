package com.section9.hw;

public class PrintMatrixToConsole {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4, 5,},
                {6, 7},
                {8, 9, 10}
        };

        //System.out.println(matrix[0].length);
        int mat_rows = matrix.length;

        for (int i=0; i < mat_rows;i++){
            int mat_col = matrix[i].length;
            for (int j = 0;j<mat_col;j++){
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }

    }

}
