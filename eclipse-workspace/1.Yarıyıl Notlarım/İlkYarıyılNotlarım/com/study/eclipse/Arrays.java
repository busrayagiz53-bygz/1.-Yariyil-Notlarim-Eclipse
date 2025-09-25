package com.study.eclipse;

public class Arrays {
	public static void main(String[] args) {
		int a = 50000;
		
		int numbers[] = new int[7]; //create the array
		
		// assinging values
		numbers[0]=10;
		numbers[1]=-2;
		numbers[2]=8;
		numbers[3]=-252;
		
		System.out.println(numbers[1]);
		System.out.println(numbers[3]);
		System.out.println(numbers[5]);
		//System.out.println(numbers[12]); -- > ArrayIndexOutOfBoundsException
		System.out.println(numbers.length);
		System.out.println(numbers[numbers.length-1]);
		
		
		for(int i=0; i<numbers.length;i++) //0-1-2-3-4-5-6
			System.out.print(numbers[i]+ " ");
		
		
		int index=0;
		while(index<numbers.length) {
			System.out.println(numbers[index]);
			index++;
		}
		
		
		double []myarray;
		
		myarray=new double[3]; //0.0|0.0|0.0
		
		int array2[]= {4,5,6,7,8};
		System.out.println(array2.length);
		System.out.println(array2[3]);
		
		
		String days[]=new String[7];//null|null|null|null|null|null|null
		System.out.println(days[0]);
		
		days[0]="monday";//monday|null|null|null|null|null|null
		days[1]="tuesday";//monday|tuesday|null|null|null|null|null
		
		for (int i = 0; i < days.length; i++) {
			System.out.print(days[i] + " ");
		}
		
		
		
	}

}
