package com.study.eclipse;

import java.util.*; // tek tek random veya scanner gibi sınıfları import etmek yerine böyle kısaca yaz.

public class AccountTest {

	public static void main(String[] args) {
		
		 // create a Scanner object to obtain input from the command window
		Scanner sc = new Scanner(System.in);
		
		 // create an Account object and assign it to myAccount
		Account myAccount = new Account();

		Account myyAccount = new Account();
		System.out.println(myyAccount.getName());
		
		// display the initial value of name (null)
		System.out.println("Inıtial name is : " + myAccount.getName());
		
		// prompt for and read name
		System.out.println("Please enter the name: ");
		String theName = sc.nextLine(); // read a line of text
		myAccount.setName(theName); // put theName in myAccount
		System.out.println(); // outputs a blank line
		
		// display the name stored in object myAccount
		System.out.println("Name in object myAccount is: " + myAccount.getName());
	}

}
