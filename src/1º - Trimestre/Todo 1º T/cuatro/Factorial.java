package cuatro;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		
	
	
	int numero = 0;
	
	System.out.println("Calculo de factorial ");
	Scanner sc = new Scanner(System.in);
	
	do {
		System.out.println("Introduce un número entero entre 0 y 1000: ");
		numero = Integer.parseInt(sc.nextLine());
	} while(numero < 0 || numero > 1000 );
	
	int factorial=1;
	for (int i=1; i<numero; i++) 
		factorial *= i;
	
	System.out.println("Factorial de "+numero+" es: "+factorial);	
	
sc.close();

}
}