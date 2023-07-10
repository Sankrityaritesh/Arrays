package com.ritesh;

import java.util.Scanner;

public class MatrixSpriral{
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        spiralTraversal(matrix);
    }

    public static void spiralTraversal(int[][] matrix) {
        int topRow = 0;
        int bottomRow = matrix.length - 1;
        int leftColumn = 0;
        int rightColumn = matrix[0].length - 1;

        while (topRow <= bottomRow && leftColumn <= rightColumn) {
            // Print top row
            for (int i = leftColumn; i <= rightColumn; i++) {
                System.out.print(matrix[topRow][i] + " ");
            }
            topRow++;

            // Print right column
            for (int i = topRow; i <= bottomRow; i++) {
                System.out.print(matrix[i][rightColumn] + " ");
            }
            rightColumn--;

            if (topRow <= bottomRow) {
                // Print bottom row
                for (int i = rightColumn; i >= leftColumn; i--) {
                    System.out.print(matrix[bottomRow][i] + " ");
                }
                bottomRow--;
            }

            if (leftColumn <= rightColumn) {
                // Print left column
                for (int i = bottomRow; i >= topRow; i--) {
                    System.out.print(matrix[i][leftColumn] + " ");
                }
                leftColumn++;
            }
        }
    }
}