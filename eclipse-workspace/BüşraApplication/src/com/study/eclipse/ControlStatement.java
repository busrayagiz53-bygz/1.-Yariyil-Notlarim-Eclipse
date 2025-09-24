package com.study.eclipse;
import java.util.Scanner;
public class ControlStatement {

	public static void main(String[] args) {
				
				//grade>85 --> pass
				//grade<85 --> fail
				
				//boolean - true , false
				
				boolean ligthOn=false;
				
				//if(condition)
					//execute this line
				
				
				
				int grade=60;
				if(grade>85) {
					System.out.println("passed");
					System.out.println("congrats!!");
				}
				else {
					System.out.println("failed");		
					System.out.println("try again next year :( ");
				}
				
				System.out.println("program finished");
				//100-90 -->A
				//90-80 -->B
				//80-70 -->C
				//70-60 -->D
				//<60 --->F
				
				//if-if-if.... block
				if(grade>90) {
					System.out.println("A");
					System.out.println("well done");
				}
				if(grade>80)
					System.out.println("B");
				if(grade>70)
					System.out.println("C");
				if(grade>60)
					System.out.println("D");
				else {
					System.out.println("F");
					System.out.println(":(");
				}
//				
//				System.out.println("------------------------");
//				//if- else if block
//				
				if(grade>=90) {
					System.out.println("A");
				}
				else if(grade>=80) {
					System.out.println("B");
				}
				else if(grade>=70)
					System.out.println("C");
				else if(grade>=60)
					System.out.println("D");
				else {
					System.out.println("F");
				}
				
				System.out.println("End of class");

				
			//if(boolean condition)
				//<,>,<=,>=
				//90==90 --> true
				//== are they equal?
				//!= they are not equal?
				
				//5==5 true
				//5==6 false
				
				//5!=5 false
				//5!=6 true

				System.out.println(grade==60);
				
				if(grade==90)
					System.out.println("it is 60");
				
				Scanner sude = new Scanner(System.in);
				System.out.println("Enter a number");
				int number = sude.nextInt();
				if(number%2==1)			
					System.out.println("odd");
				else
					System.out.println("even");
				
				//inline if		
				System.out.println(number%2==0 ? "even":"odd");
				
				
			}

		}

	


