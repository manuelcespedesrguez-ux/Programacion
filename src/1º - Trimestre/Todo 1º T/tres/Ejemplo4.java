package tres;

import java.util.Scanner;

public class Ejemplo4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Empezamos en el uno...");
		System.out.println("¿Hasta qué número quieres contar?");
		int numero = Integer.parseInt(sc.nextLine());
		int contador = 1;
		
		do { 
			System.out.println(contador);
			contador++;
		} while (contador <= numero);
		
		sc.close();
	}
	
}
