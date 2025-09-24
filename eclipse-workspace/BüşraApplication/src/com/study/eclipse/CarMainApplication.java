package com.study.eclipse;

import java.util.Random;

public class CarMainApplication {

	public static void main(String[] args) {
		
		Car volvo=new Car();
		Random rnd = new Random();
//		volvo.brand="volvo";
//		volvo.model="s90";
//		volvo.age=2;
//		volvo.color="white";
		volvo.start();   // EĞER BU ŞEKİLDE METODU ÇAĞIRMADAN DİREKT YALNIZCA OVERRİDE EDEREK System.out.println(volvo); YAZARSAK ÇIKTISI 0 OLUR.
		System.out.println(volvo);  //System.out.println(volvo) ifadesi volvo.toString() metodunu çağırır. Eğer toString() override edilmişse "Speed: 10" yazdırılır.
		
		
		//volvo.currentSpeed=-400;  Burada volvo nesnesinin currentSpeed değişkenine doğrudan dışarıdan (örneğin main metodundan) erişmeye çalışıyorsun.
									//Ancak currentSpeed private olduğu için doğrudan erişime izin vermez ve program hata verir.
		//volvo.setSpeed(-400);  currentSpeed'e değer atanır.
		//System.out.println(volvo.getSpeed());  	 Değeri alır.

		System.out.println(volvo);
		
		volvo.setColor("white");
		System.out.println(volvo.getColor());
		
		volvo.setSpeed(50);
		System.out.println(volvo);
		volvo.setSpeed(56789);
		System.out.println(volvo);
		
		System.out.println(volvo.getBrand());
		
		StudentClassObjects  s1 = new StudentClassObjects();
		StudentClassObjects  s2= new StudentClassObjects ("aysenur");
		StudentClassObjects  s3 = new StudentClassObjects ("emre", "gunduz", "SEN");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}

}
