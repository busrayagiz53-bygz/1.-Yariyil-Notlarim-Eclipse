package com.study.eclipse;

import java.util.Scanner;

public class TryCatchStatement {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        try {
	            System.out.print("Bir sayı girin: ");
	            int number = scanner.nextInt();  // Kullanıcıdan bir tam sayı girişi bekliyor
	            System.out.println("Girdiğiniz sayı: " + number);
	        } 
	        catch (Exception e) {
	            System.out.println("Geçersiz giriş! Lütfen bir sayı girin.");
	        }

	        scanner.close();

	}

}
