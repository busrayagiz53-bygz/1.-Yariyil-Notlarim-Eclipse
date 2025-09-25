package com.study.eclipse;

		import java.util.Scanner;

		public class Methods2 {

			public static void main(String[] args) {
				Scanner input = new Scanner(System.in);
				System.out.println("Which symbol?");
				String symbol=input.nextLine();
				System.out.println("How many symbols?");
				int number=input.nextInt();
				
				printSymbol(symbol, number);

			}
			
			public static void printSymbol( String symbol, int numberOfIterations) { //parameter
				
				for (int i = 0; i < numberOfIterations; i++) {
					System.out.print(symbol);
				}
				System.out.println();
			}

		}


	