package com.study.eclipse;

public class ConstructorAccountClass {
		    private String name; // instance değişkeni

		    // Constructor
		    public ConstructorAccountClass(String name) {
		        this.name = name;
		    }

		    // Getter metodu
		    public String getName() {
		        return name;
		    }

		    public static void main(String[] args) {
		        // Nesne oluşturma ve constructor çağrısı
		    	ConstructorAccountClass hesap = new ConstructorAccountClass("Ali");

		        // Nesne üzerinden name değerini gösterme
		        System.out.println("Hesap Sahibi: " + hesap.getName());
		    }
		}


	
