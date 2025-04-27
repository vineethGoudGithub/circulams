package com.linkfields.Day8;

import java.util.Scanner;

public class PatternPyramid {//Main Class

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of rows: ");
	        int n = scanner.nextInt();

	        for (int i = 1; i <= n; i++) {
	            // Print spaces
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print(" ");
	            }

	            // Print stars
	            for (int k = 1; k <= (2 * i - 1); k++) {
	                System.out.print("*");
	            }

	            // Move to next line
	            System.out.println();
	        }

	        scanner.close();
	    }
	}


