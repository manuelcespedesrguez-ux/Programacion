package cuatro;

import java.util.Scanner;

public class Divisores {

	public static boolean esPerfecto(int n) {

		int suma = 0;

		for (int j = 1; j < n; j++) {
			if (n % j == 0)
				suma += j;
		}
		if (suma == n)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {

		System.out.println("Obtener todos los divisores de un entero");

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un entero positivo: ");
		int entero = Integer.parseInt(sc.nextLine());

		System.out.println("El número " + entero + " tiene los siguientes divisores: ");

		for (int j = 1; j <= entero; j++) {
			if (entero % j == 0)
				System.out.println(j + ", ");
		}

		System.out.println("El número " + entero + " es perfecto??: " + esPerfecto(entero));

		sc.close();
	}

}
