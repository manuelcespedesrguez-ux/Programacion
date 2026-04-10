package tres;

import java.util.Scanner;

public class Ejemplo5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Empezamos en el uno...");
		System.out.println("¿Hasta qué número quieres contar?");
		int numero = Integer.parseInt(sc.nextLine());
		
		for(int i=1; i<=numero; i++) {
			System.out.println(i);			
		}
		
		System.out.println("Veamos solo los pares...");
		
		for(int j=0;j<=numero;j=j+2) {
			System.out.println(j);
		}
		
		System.out.println("Veamos solo los nones...");
		
		for(int k=1; k<=numero;k=k+2) {
			System.out.println(k);
		}
		
		sc.close();
	}
	
}
