package boletin;

import java.util.Scanner;

public class Boletin4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double num = 0;
		int contador = 0;
		System.out.println("Introduce un número: ");

		do {
			num = Double.parseDouble(sc.nextLine());
			if (num > 0) {
				contador++;
				System.out.println("El total de números introducidos es: " + contador);
			} else
				System.out.println("Fin del programa");
		} while (num > 0);

		sc.close();
	}

}
