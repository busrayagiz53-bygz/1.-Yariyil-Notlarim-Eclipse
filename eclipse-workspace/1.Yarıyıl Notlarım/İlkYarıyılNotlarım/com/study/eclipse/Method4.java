package com.study.eclipse;

import java.util.Scanner;

public class Method4 {
	
		public static void main(String[] args) {
			
			print6();

			print6();
			print6();
			print6();
			
			int returnedValue=give6Back();
			System.out.println(returnedValue);
			
			String value = welcomeUser();
			
			System.out.println(welcomeUser());
			
			String userName=getUserName();
			System.out.println("welcome, " + userName);
			System.out.println(welcomeUser() + " " +getUserName());
			
			System.out.println(add(10,20));
		}
		
		public static void print6() {
			System.out.println("6");
		}
		
		public static int give6Back() {
			return 6;
		}
		
		public static String welcomeUser() {
			return "hi";
		}
		
		//get the user name and return it
		
		public static String getUserName() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your name");
			String name = sc.next();
			return name;
			
		}
		
		public static int add(int a, int b) {
			return a+b;
		}
		
		

	}


	
