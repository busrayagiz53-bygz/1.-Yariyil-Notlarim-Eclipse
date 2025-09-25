package com.study.eclipse;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		    // create and output two-dimensional arrays
		   
		        // Initialize two-dimensional arrays
		        int[][] array1 = {{1, 2, 3}, {4, 5, 6}};
		        int[][] array2 = {{1, 2}, {3}, {4, 5, 6}};

		        System.out.println("Values in array1 by row are:");
		        outputArray(array1); // displays array1 by row

		        System.out.printf("%nValues in array2 by row are:%n");
		        outputArray(array2); // displays array2 by row
		    }

		    // output rows and columns of a two-dimensional array
		    public static void outputArray(int[][] array) {
		        for (int row = 0; row < array.length; row++) { // iterate through rows
		            for (int column = 0; column < array[row].length; column++) { // iterate through columns
		                System.out.print(array[row][column] + " ");
		            }
		            System.out.println(); // move to next line after each row
		        }
		    }
		} // end class InitArray

