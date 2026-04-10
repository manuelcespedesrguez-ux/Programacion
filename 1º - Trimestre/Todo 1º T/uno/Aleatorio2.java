package uno;

public class Aleatorio2 {
	
	//Usando Math.random() java
	
	 public static void main(String[] args) {
		
		 // Decimal aleatorio entre 0.0 1.0
		double aleatorio = Math.random();
		System.out.println("Decimal aleatorio: " + aleatorio);
		
		// entero aleatorio entre 1 y 6 (simular dado)
		int dado = (int)(Math.random() * 6)  +1;
		System.out.println("Tirada de dado: " + dado);
    
	}

}
