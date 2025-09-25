package com.study.eclipse;

public class MetodReturnVeVoid {
	
	static int power(int a, int b) {  // burada static ten sonra gelen "void" i int'e çevirdik çünkü 
		int result = 1;      		  // void değil de döndüreceğimiz verinin türünü belirliyoruz.
		for (int i = 1; i <= b; i++) {
			result *= a;
		}
		return result;  // result yerine 1 yazsaydık output 1 olurdu çünkü orda döndürdüğümüz şey bu kez result değil 1 in kendisi.
	}					// Yani döndürdüğüğmüz değer aşağıya gelir. RETURN ifadesi metodu çağıran yere döndürür.
	
	
	static void power2(int a, int b) {  
		int result = 1;      		  
		for (int i = 1; i <= b; i++) {
			result *= a;
		}
		System.out.println(result);  
	}	
	public static void main(String[] args) {
		
		 int r2 = power(10,2);
		 System.out.println(r2);
         power2(5,3);
	}

}
