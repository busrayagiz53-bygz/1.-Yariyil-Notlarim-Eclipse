package com.study.eclipse;

public class MethodOverloadExample { 
	
	    // Parametrelerin sayısı farklı
	    public int add(int a, int b) {
	        return a + b;
	    }

	    // Parametrelerin türü farklı
	    public double add(double a, double b) {
	        return a + b;
	    }

	    // Parametre sayısı farklı
	    public int add(int a, int b, int c) {
	        return a + b + c;
	    }

	    public static void main(String[] args) {
	    	
	    	/*Bu satırda, OverloadExample sınıfından bir nesne (object) oluşturuluyor. Bu işlemde, sınıfın örneğini (instance) oluşturuyoruz ve oluşturduğumuz bu nesne üzerinden sınıfın metodlarına erişiyoruz.
  Açıklama:
  OverloadExample example = new OverloadExample();
  OverloadExample: Bu sınıfın adıdır.
  example: Bu, sınıfın bir örneği (nesnesi) için verilen isimdir. Sınıfın özelliklerine ve metodlarına erişmek için bu nesne kullanılır.
  new OverloadExample();: Bu, sınıfın bir nesnesini oluşturur ve sınıfın constructor'ı (yapıcı metodu) çağrılır. Bu işlemle, example nesnesi bellekte oluşturulur.
  Bu tür bir nesne oluşturma, instance method (örnek metodlar) kullanabilmek için gereklidir. Statik metodlar (static ile işaretlenmiş metodlar) ise nesne oluşturmadan doğrudan sınıf adıyla çağrılabilir.*/
	        MethodOverloadExample example = new MethodOverloadExample();
	        
	        // Farklı parametre türleriyle çağrı yapılıyor
	        System.out.println("int add: " + example.add(5, 10));        // Çıktı: 15
	        System.out.println("double add: " + example.add(5.5, 10.2)); // Çıktı: 15.7
	        System.out.println("int add 3 params: " + example.add(5, 10, 15)); // Çıktı: 30
	        
	        /*Neden nesne ile çağırdım?
         ---> add metodları, instance methods (örnek metodlar) olduğundan, bunları çağırmak için önce sınıfın bir nesnesini oluşturmak gerekir. example nesnesi bu amaçla kullanıldı.
         ---> Eğer add metodları statik (static) olsaydı, sınıf adı ile doğrudan çağrılabilirlerdi:
         
              OverloadExample.add(5, 10); // Statik metod olduğunda doğrudan sınıf adıyla çağrılır. */
	        
	        
	    }
	}


