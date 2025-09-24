package com.study.eclipse;

public class Method3 {

	public static void main(String[] args) {
		countN(8);
		countN(100);
		
		//1 2 3 4 5
		//1 2 3 4
		//1 2 3
		//1 2
		//1
		
		for (int i = 5; i > 0; i--) { //5-4-3-2-1
			countN(i);
		}
		countN(5);
		countN(4);
		countN(3);
		countN(2);
		countN(1);
		
		// araya sıkıştırdığım bir Math....(x); örneği
		double result;
		result = Math.log(Math.E*Math.E);
        System.out.println(result);  
	}

	//count to given N value
	public static void countN(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
