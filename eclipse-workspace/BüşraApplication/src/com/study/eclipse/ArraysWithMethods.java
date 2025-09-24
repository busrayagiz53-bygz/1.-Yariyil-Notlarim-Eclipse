package com.study.eclipse;

import java.util.Arrays;

public class ArraysWithMethods {

	public static void main(String[] args) {
		int number=5;
		System.out.println("Before the method: " + number); 
		change(number);
		System.out.println("After the method: " + number);
		
		System.out.println("--------------");

		number=5;
		System.out.println("Before the method: " + number); 
		change2(number);
		System.out.println("After the method: " + number);
		
		System.out.println("--------------");

		number=5;
		System.out.println("Before the method: " + number); 
		number=change2(number);
		System.out.println("After the method: " + number);
		
		System.out.println("---------------");
		
		int[] numbers= {3,6,9};
		System.out.println("Before the method: " + Arrays.toString(numbers)); 
		change3(numbers);
		System.out.println("After the method: " + Arrays.toString(numbers)); 
	}
	
	public static void change3(int[] myArray) { 
		myArray[0]=10;
	}
	
	public static int change2(int a) {
		a=10;
		return a;
	}

	public static void change(int a) {
		a=10;
		

	}

}
