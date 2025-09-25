package com.study.eclipse;

public class Methods1SelfStudy {

	public static void main(String[] args) {
		// f(x) = (x + 2) * 6     f(4) = 36
		f(4);    // önce f metodunu aradı sonra parametresine baktı x var dedi ve yerine 4 koydu.
		System.out.println("İkinci Metot");
		f(6);
		
		power(2,3);  // power(2.0,3); diyemeyiz çünkü metodun türü integer , double değil.
		power(3,2);
    }
	
	public static void f(int x) { // parametre -> direkt " void f(int x) { yazılabilirdi ancak yukarıdaki static void metodundan ul
		int result = (x + 2) * 6;                                          // bu metoda ulaşabilmemiz için başına "static" ifadesini eklemeliyiz.
				System.out.println(result);
		
	}
	
    static void power(int number1,int number2) {
		int result = 1;
		for (int i = 1; i <= number2; i++) {
			result *= number1; 
		}
		System.out.println("Cevap : " + result);
	}

}
