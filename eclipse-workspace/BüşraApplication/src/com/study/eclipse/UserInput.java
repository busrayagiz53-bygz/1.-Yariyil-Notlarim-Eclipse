package com.study.eclipse;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		int number1 =5;
		Scanner batuhan = new Scanner(System.in);
		//prompt
//		System.out.println("How old are you?");
//		int age=batuhan.nextInt();
//		System.out.println("ok so you are " + age + " years old");
//
//		System.out.println("What is your heigth");
//		double heigth = batuhan.nextDouble();
//		System.out.println("You are " + heigth + " cm.");
//		batuhan.nextLine();  //  Araya bunu koyduk çünkü aksi takdirde iki tane next.Line ard
		                     // arda gelecekti . Bu da hataya yol açardı. ÖNEMLİ!!!!
		
		System.out.println("what is your name");
		String name = batuhan.nextLine();
		System.out.println("welcome,"+name);
		System.out.println("when is your birth year?");
		int birthYear = batuhan.nextInt();
		System.out.println("you are " + (2024-birthYear) +" years old");
		
		//SELF STUDY
		//get two numbers from the user as an input
		//+
		//-
		//*
		// /
		//display the resul

	}

}
