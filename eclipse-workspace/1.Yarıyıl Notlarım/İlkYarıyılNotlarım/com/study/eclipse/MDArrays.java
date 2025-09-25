package com.study.eclipse;

import java.util.Random;

public class MDArrays {

	public static void main(String[] args) {
		// 1. every data type can have an array
				// 2. every array becomes a data type
				
				int[] a= {1,2,3,4};
				int[][] mdArray = new int[2][4];
				
				int[] x = new int[3];
				
				int[][] b = new int[3][];
				b[0]=new int[2];
				b[1]=new int[4];
				b[2]=a;
				
				System.out.println(b[1][3]);
				System.out.println(b[2][2]);
				
				int[][] c = new int[3][];
				c[0]=new int[2];
				c[1]= new int[3];
				c[2]=new int[4];
				fill2DArray(c);
				print2DArray(c);

			}
			
			public static void fill2DArray(int[][] myArray) {
				Random rnd = new Random();
				for (int i = 0; i < myArray.length; i++) { //rows
					for (int j = 0; j < myArray[i].length ; j++) { //columns
					myArray[i][j]=rnd.nextInt(100);
				}	
				}
				
			}
			
			public static void print2DArray(int[][] myArray) {
				for (int rows = 0; rows < myArray.length; rows++) {
					for (int columns = 0; columns < myArray[rows].length; columns++) {
						System.out.print(myArray[rows][columns] + " ");
					}
					System.out.println();
				}
			}
			
			//SELF STUDY
			public static void rowSum(int[][] mdArray) {
				//it should calculate sum of each row, print it
			}
			
			public static void columnSum(int[][] mdArray) {
				//it should calculate sum of each column, print it	
		

	}

}
