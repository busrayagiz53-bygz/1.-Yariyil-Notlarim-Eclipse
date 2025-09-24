package com.study.eclipse;


public class EnhancedForStatement {

	public static void main(String[] args) {
	
		 // Using the enhanced for statement to total integers in an array.
		
		int[] array = {87,68,94,100,83,78,85,91,76,87} ;
		int total = 0;
		
		// ADD EACH ELEMENTS TO VALUE TO TOTAL
		for (int number : array) 
			total += number;
			
			System.out.printf("Total of array elements: %d%n" , total);
		
	

	}

}
