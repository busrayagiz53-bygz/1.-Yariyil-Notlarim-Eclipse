package com.study.eclipse;

import java.util.Scanner;

public class SelfStudy {

	public static void main(String[] args) {
		        
		
		        // Örnek başlangıç değerleri
		        /*int a = 50;
		        int b = 10;
		        int c;

		        // 1. a ve b'nin toplamını c'ye ata, ardından b'yi 1 azalt
		        c = a + b;
		        b--; // b = b - 1;

		        // 2. a'nın 100'den küçük olup olmadığını test et ve sonucu yazdır
		        if (a < 100) {
		            System.out.println("a is less than 100");
		        }

		        // 3. a'yı 1 artır, ardından b'ye ekle ve sonucu b'ye ata
		        b += ++a; // a = a + 1, ardından b = b + a

		        // 4. a'yı b'ye bölerek bölümünü hesapla ve sonucu a'ya ata
		        a = a / b; // a = a ÷ b

		        // Sonuçları ekrana yazdır
		        System.out.println("Final values:");
		        System.out.println("a = " + a);
		        System.out.println("b = " + b);
		        System.out.println("c = " + c);/*
		        import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		/*
		 * Question #5
		 * The process of finding the largest value is used frequently in computer applications. For
		 * example, a program that determines the winner of a sales contest would input the number of
		 * units sold by each salesperson. The salesperson who sells the most units wins the contest. Write
		 * an application that inputs a series of 10 integers and determines and prints the largest integer.
		 * Your program should use at least the following three variables:
		 * � counter: A counter to count to 10 (i.e., to keep track of how many numbers
		 * have been input and to determine when all 10 numbers have been processed).
		 * � number: The integer most recently input by the user.
		 * � largest: The largest number found so far.
		 */

		// Declare a new scanner instance
		Scanner input = new Scanner(System.in);

		// Declare the largest value with an initial value of 0
		int largestNumber = 0;

		// Iterate 10 times, and ask for an input
		// If given input is greater than largest number, update largest number with given number.
		for(int i=1; i<=10; i++) {
			// Ask and gather input
			System.out.println("Enter sold unit number for salesperson#" + i + ": ");
			int soldUnit = input.nextInt();
			
			// Check if it is greater than current largest value, if so update it!
			if(soldUnit > largestNumber)
				largestNumber = soldUnit;
		}
		
		// After iterating 10 times, print the largest number found so far
		System.out.println("Largest number of sales made = " + largestNumber);

		        
	}
}
		
	
	
	
	
	
	
	
	

