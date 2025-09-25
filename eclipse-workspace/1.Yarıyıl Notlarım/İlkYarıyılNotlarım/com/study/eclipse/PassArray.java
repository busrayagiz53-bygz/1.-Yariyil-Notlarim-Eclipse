package com.study.eclipse;

public class PassArray {

	public static void main(String[] args) {
		// Fig. 7.13: PassArray.java
		// Passing arrays and individual array elements to methods.

		        int[] array = {1, 2, 3, 4, 5};

		        System.out.printf(
		            "Effects of passing reference to entire array:%n" +
		            "The values of the original array are:%n");

		        // Output original array elements
		        for (int value : array) {
		            System.out.printf("   %d", value);
		        }

		        System.out.println();

		        // Pass array reference to modifyArray method
		        modifyArray(array);
		        System.out.printf(
		            "%nThe values of the modified array are:%n");

		        // Output modified array elements
		        for (int value : array) {
		            System.out.printf("   %d", value);
		        }

		        System.out.println();

		        // Output the value of array[3] before and after modifyElement
		        System.out.printf(
		            "%nEffects of passing array element value:%n" +
		            "array[3] before modifyElement: %d%n", array[3]);

		        modifyElement(array[3]); // Attempts to modify array[3]
		        System.out.printf(
		            "array[3] after modifyElement: %d%n", array[3]);
		    }

		    // Multiply each element of an array by 2
		    public static void modifyArray(int[] array) {
		        for (int counter = 0; counter < array.length; counter++) {
		            array[counter] *= 2;
		        }
		    }

		    // Multiply argument by 2
		    public static void modifyElement(int element) {
		        element *= 2;
		        System.out.printf(
		            "Value of element in modifyElement: %d%n", element);
		    }
		}
