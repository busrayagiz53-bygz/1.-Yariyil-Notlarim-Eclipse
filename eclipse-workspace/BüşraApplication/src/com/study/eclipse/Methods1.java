package com.study.eclipse;

public class Methods1 {

	public static void printStars() {
		
		for (int i = 0; i < 50; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		printStars();
		printHashTag();
		printStars();
		printStars();
		printHashTag();
		
		printSymbol(5); //argument
		printSymbol(25);
		System.out.println("the end");

	//	System.out.println(numberOfhashtags);
		int numberOfhashtags = 20;
		System.out.println(numberOfhashtags);
		
		System.out.println(3456);
		System.out.println("mhngfdas");
		System.out.println(4.6);
		
		printSymbol(15);
		printSymbol(15,"$");
		printSymbol(8, "java");
		printSymbol("java",8);
		
	}
	
	public static void printHashTag() {
		int numberOfhashtags = 20;
		for (int i = 0; i < numberOfhashtags; i++) {
			System.out.print("#");
		}
		System.out.println();
	}
	
	public static void printSymbol(int numberOfIterations) { //parameter
		
		for (int i = 0; i < numberOfIterations; i++) {
			System.out.print("?");
		}
		System.out.println();
	}
	//method overloading
	public static void printSymbol(int numberOfIterations, String symbol) { //parameter
		
		for (int i = 0; i < numberOfIterations; i++) {
			System.out.print(symbol);
		}
		System.out.println();
	}

	public static void printSymbol( String symbol, int numberOfIterations) { //parameter
		
		for (int i = 0; i < numberOfIterations; i++) {
			System.out.print(symbol);
		}
		System.out.println();
	}
}
