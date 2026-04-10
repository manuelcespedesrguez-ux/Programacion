package cuatro;

import java.util.Scanner;

public class Ejercicioexamen2 {

	public static void main(String[] args) {
		
		double nota=0d;
		
		System.out.println("Comprobación de calificación a partir de nota numérica... ");
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Introduce la nota numérica entre 0.0 y 10.0: ");
			nota = Double.parseDouble(sc.nextLine());
		} while(nota<0 || nota > 10 );
		
		if (nota >= 9.0) {
			System.out.println("Sobresaliente");
		} else if (nota >= 8.0) {
			System.out.println("Notable");
		}else if (nota >= 7.0) {
			System.out.println("Notable");
		}else if (nota >= 6.0) {
			System.out.println("Bien");
		}else if (nota >= 5.0) {
			System.out.println("Suficiente");
		}else {
			System.out.println("Insuficiente");
		}
	sc.close();
	}
}
