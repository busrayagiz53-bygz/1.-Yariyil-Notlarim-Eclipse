package com.study.eclipse;

public class ConstructorAccTest {

	public static void main(String[] args) {
		
		// create two Account objects
		ConstructorAccountClass account1 = new ConstructorAccountClass("Büşra Yağız");
		ConstructorAccountClass account2 = new ConstructorAccountClass("Esmanur Yağız");
		
		// display initial value of name for each Account 
		System.out.println("account1 name is: " + account1.getName());
		System.out.println("account2 name is: " + account2.getName());

	}

}
