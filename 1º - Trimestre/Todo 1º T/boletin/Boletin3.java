package boletin;

import java.util.Scanner;

public class Boletin3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double num = 1;
		System.out.println("Introduce un número: ");

		do {
			num = Double.parseDouble(sc.nextLine());
			if (num % 2 == 0 && num != 0) {
				System.out.println(num + " es par");
			} else if (num % 2 != 0) {
				System.out.println(num + " es impar");
			} else if (num % 2 == 0)
				System.out.println("El programa ha finalizado");
		} while (num != 0);

		sc.close();
	}

}
