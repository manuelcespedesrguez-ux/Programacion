package boletin;

import java.util.Scanner;

public class boletin7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double num = 0, media = 0;
		int contador = 0;
		System.out.println("Dame un número :");

		do {
			num = Double.parseDouble(sc.nextLine());
			media += num;
			contador++;
		} while (num >= 0);
		System.out.println("La media de todos los números es: " + media / contador);

		sc.close();
	}
}
