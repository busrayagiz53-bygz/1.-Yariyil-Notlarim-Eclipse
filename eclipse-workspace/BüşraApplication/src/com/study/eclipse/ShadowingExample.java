package com.study.eclipse;

public class ShadowingExample {
	    private int x = 10; // Sınıfın alanı (field)

	    public void methodExample(int x) { // Parametre, sınıfın alanını gölgeler
	        System.out.println("Parametre x: " + x); // Burada parametre x kullanılır
	        System.out.println("Sınıfın alanı x: " + this.x); // `this` ile sınıfın alanına erişilir

	        int x = 20; // HATA: Parametre x zaten var, aynı isimle başka bir değişken tanımlanamaz
	    }

	    public void blockExample() {
	        int x = 30; // Yerel değişken, sınıf alanı x'i gölgeler
	        System.out.println("Yerel x: " + x); // Yerel x kullanılır
	        System.out.println("Sınıfın alanı x: " + this.x); // `this` ile sınıfın alanına erişilir
	    }

	    public static void main(String[] args) {
	        ShadowingExample example = new ShadowingExample();
	        example.methodExample(50);
	        example.blockExample();
	    } 
	}



