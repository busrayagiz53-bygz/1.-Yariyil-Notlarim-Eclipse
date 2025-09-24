package com.study.eclipse;

import java.util.*;

public class ArrayRandomPassword {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		Random r = new Random();
//		for (int i = 0; i < 100; i++) {
//			
//			System.out.println(r.nextInt(100)); //0-99
//		}
		System.out.println((char)65);
		System.out.println((char)(65+1));

		generatePassword(12);
//		
//		String word="";
//		word+="a";
//		word+="b";
//		System.out.println(word);
}
	
	public static int generatePassword(int length) {
		Random r = new Random();
		char[] symbols = {'*','_','%','#','?'};
		char[] upperCaseLetter = new char[26];
		char[] lowerCaseLetter = new char[26];
		for (int i = 0; i < upperCaseLetter.length; i++) {
			upperCaseLetter[i]=(char)(65+i);
			lowerCaseLetter[i]=(char)(97+i);
		}
		
		String password="";
		for (int i = 0; i < length; i++) {
			
			int set=r.nextInt(4);//0-1-2-3
			//0:number
			//1:lower
			//2:upper
			//3:symbol
			
			if(set==0) {
				//pick a random number
				int number=r.nextInt(10);//0-9
				password+=number;
				
			}
			else if(set==1) {
				//pick a random lower case letter
				int indx = r.nextInt(lowerCaseLetter.length);//0-25
				password+=lowerCaseLetter[indx];		
				
			}
			else if(set==2) {
				//pick a random upper case letter
				int indx = r.nextInt(upperCaseLetter.length);//0-25
				password+=upperCaseLetter[indx];
				
			}
			else {
				//random symbol
				int indx = r.nextInt(symbols.length);//0-4
				password+=symbols[indx];
			}
			
			
			
		}
		
		System.out.println(password);
		return length;

	}

}
