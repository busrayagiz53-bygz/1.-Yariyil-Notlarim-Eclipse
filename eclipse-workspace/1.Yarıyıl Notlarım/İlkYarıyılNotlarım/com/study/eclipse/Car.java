
package com.study.eclipse;

public class Car {

	
	//concepts of OOP
		//1. encaspulation : data hiding
		//1.1 hide your data - make them private
		//1.2 provide public methods to get and set those values
		
		
		//public -- > open for public use
		//protected --> same package
		//private --> only the class it is declared in
		
		//2. inheritance
		//3. Abstraction
		//4. Polymorphism
		
		
		//states
		private String color;
		private String brand;
		private String model;
		private int age;
		private int horsePower;
		private int currentSpeed;
		private int maxSpeed=240;
		
		
		//method
		
		//set a color value
		public void setColor(String color) {	
			this.color=color;
		}
		
		//get the color value
		public String getColor() {
			return color;
		}
		
		//set the speed
		public void setSpeed(int currentSpeed) {
			if(currentSpeed>maxSpeed) {
				System.out.println("invalid speed value.");
				this.currentSpeed=maxSpeed;
			}
			else if(currentSpeed<0)
				this.currentSpeed=0;
			else
				this.currentSpeed=currentSpeed;
		}
		
		//get the speed
		public int getSpeed() {
			return currentSpeed;
		}
		
		
		
		//read-only
		public String getBrand() {
			return brand;
		}



		//read-only
		public String getModel() {
			return model;
		}


		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public int getHorsePower() {
			return horsePower;
		}

		public void setHorsePower(int horsePower) {
			this.horsePower = horsePower;
		}

		public int getMaxSpeed() {
			return maxSpeed;
		}

		public void setMaxSpeed(int maxSpeed) {
			this.maxSpeed = maxSpeed;
		}

		public void start() {
			currentSpeed=10;
		}
		
		public void speedUp() {
			currentSpeed+=20;
		}
		
		public void speedDown() {
			currentSpeed-=20;
		}
		public void stop() {
			currentSpeed=0;
		}
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub   // override etmezsek sırasıyla CarMainApplication sınıfında yazdığımız gibi volvo.start(); 
			return "Speed:" + currentSpeed; 	 // System.out.println(volvo); çıktısını şu şekilde alırız: com.study.eclipse.Car@9e89d68
												 // yani className@hashCode şeklinde. 
		}
		 /* toString() metodu, Java'da Object sınıfından gelir ve nesneleri bir String olarak temsil etmek için kullanılır.
         Override etmek: toString() metodunun varsayılan davranışını değiştirerek özelleştirilmiş bir metin çıktısı oluştururuz.
		 Eğer toString() metodunu override etmezsek, System.out.println(volvo) gibi bir kullanımda nesnenin referans değeri ya da sınıf adı ve bellek adresi yazdırılır.*/
		
		/*Özetle:
		Override burada toString() metodunun davranışını değiştirerek nesnenin anlamlı bir çıktısını oluşturmak için kullanılır.
		Bu sayede System.out.println(volvo) çağrıldığında, nesnenin durumu ya da özel bilgileri yazdırılabilir.*/
		
		
		
		

	}
