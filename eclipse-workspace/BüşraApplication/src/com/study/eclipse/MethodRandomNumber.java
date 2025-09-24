package com.study.eclipse;

public class MethodRandomNumber {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(Math.random());
		}
		
		int ones=0, twos=0,threes=0,fours=0,fives=0,sixes=0;
		for (int i = 0; i < 500; i++) {
			int side=rollADie();
			switch (side) {
			case 1:
				ones++;
				break;
			case 2:
				twos++;
				break;
			case 3:
				threes++;
				break;
			case 4:
				fours++;
				break;
			case 5:
				fives++;
				break;
			case 6:
				sixes++;
				break;

			default:
				break;
			}
				
		}
		
			System.out.println("1:" + ones);
			System.out.println("2:" + twos);
			System.out.println("3:" + threes);
			System.out.println("4:" + fours);
			System.out.println("5:" + fives);
			System.out.println("6:" + sixes);

	}
	

	
	public static int rollADie() {
		double core = Math.random();
		//min:0.0*6=0.0 max:0.999999999*6=5.9996
		//(int) 0, max=5
		//+1 --> 1, max=6
		
		core*=6;
		int side = (int)core;
		side++;
		
		return side;
	}
	
	public static int max(int a, int b) {
		if(a>b)
			return a;
		else
			return b;
	}

}
