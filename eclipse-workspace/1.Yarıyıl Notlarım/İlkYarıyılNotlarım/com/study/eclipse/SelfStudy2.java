package com.study.eclipse;

public class SelfStudy2 {

	public static void main(String[] args) {
	 
		/*int sum = 0;
		for(int i = 0; i <50; i += 2) {
			sum += i;
		}
		System.out.println("The sum is " + sum);/*
         /*
		 * Question #9b and #9c
		 * Print the integers from 1 to 100, using a while loop and the counter variable x. Print only 10
		 * integers per line. [Hint: Use the calculation x % 10. Then the value of this expression is 0,
		 * print a newline character; otherwise, print a tab character. Assume that this code is an
		 * application. Use System.out.println() to give the output the newline character, and use the
		 * System.out.print(�\t�) to give the output with tab character.] 
		 */
		
		// Start a loop from 1 to 100, with the counter variable "x"
		int x = 1;
		while(x <= 100) { // Keep looping while x<=100
			System.out.print(x); // Print the value of x
			
			// If x is divisible by 10, then print a new line ('\n'), otherwise print a tab character ('\t')
			if(x%10 == 0)
				System.out.print("\n");
			else
				System.out.print("\t");
			
			x++; // Increase x by 1 at the end of each step
		}
		
		// Lets put a new line to seperate different solutions
				System.out.print("------------------------------------------------------------------------------\n");
				
				// Now lets do the exact same thing, with a "for" loop
				for(int i=1; i<=100; i++) {
					System.out.print(i);
					
					if(i%10 == 0)
						System.out.print("\n");
					else
						System.out.print("\t");
				}
				
				/*
				 * As seen, loops can be represented as "for" and "while" loops.
				 * Any "for" loop can be wrapped up to a "while" loop with a counter variable
				 */
	}

}
