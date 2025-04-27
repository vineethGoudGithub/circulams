package com.linkfields.Day6;

public class MatricSpiralPrint {

	    public static void printSpiral(int[][] matrix) {

	        int rows = matrix.length;
	        int cols = matrix[0].length;

	        int top = 0;
	        int bottom = rows - 1;
	        int left = 0;
	        int right = cols - 1;

	        while (top <= bottom && left <= right) {

	            //  top row
	            for (int i = left; i <= right; i++) {
	                System.out.print(matrix[top][i] + " ");
	            }
	            top++;

	            //  right column
	            for (int i = top; i <= bottom; i++) {
	                System.out.print(matrix[i][right] + " ");
	            }
	            right--;

	            //  bottom row if still in bounds
	            if (top <= bottom) {
	                for (int i = right; i >= left; i--) {
	                    System.out.print(matrix[bottom][i] + " ");
	                }
	                bottom--;
	            }

	            // Print left column if still in bounds
	            if (left <= right) {
	                for (int i = bottom; i >= top; i--) {
	                    System.out.print(matrix[i][left] + " ");
	                }
	                left++;
	            }
	        }

	  System.out.println(); // Move to next line after printing
	    }

	    public static void main(String[] args) {
	        int[][] matrix = {
	            {1, 2, 3, 4},
	            {5, 6, 7, 8},
	            {9, 10, 11, 12},
	            {13, 14, 15, 16}
	        };

	        printSpiral(matrix);
	    }
	}


