package com.study.eclipse;

import java.util.Scanner;

public class Arrays2 {

	public static void main(String[] args) {
		//create an int array --> to store grade values of students
				//get the grade values from the user
				
				//calculate the classes avg
				Scanner sc = new Scanner(System.in);
				int sum=0;
				int grades[] = new int[5];//0|0|0|0|0
				for (int i = 0; i < grades.length; i++) {
					
					System.out.println("Enter the grade");
					grades[i]=sc.nextInt();
					sum+=grades[i];
				}
				
				System.out.println("AVG is " + sum/grades.length);	
			
				
				System.out.println("GRADES:");
				for (int i = 0; i < grades.length; i++) {
					System.out.print(grades[i] + " ");
				}
				
//				System.out.println("Enter the grade");
//				int grade=sc.nextInt();
//				grades[1]=grade;
//				
//				System.out.println("Enter the grade");
//				int grade=sc.nextInt();
//				grades[2]=grade;
//				
//				System.out.println("Enter the grade");
//				int grade=sc.nextInt();
//				grades[3]=grade;
				
				

	}

}
