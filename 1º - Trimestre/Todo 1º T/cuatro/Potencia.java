package cuatro;

import java.util.Scanner;

public class Potencia {

	public static int potenciaRec(int base, int exp) {

		if (exp == 0)
			return 1;

		else
			return base * potenciaRec(base, (exp - 1));

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Dame un numerín (entero, positivo) para la BASE: ");

		int base = 0, exp = 0;

		do {

			base = Integer.parseInt(sc.nextLine());

			if (base < 0)
				System.out.println("Positivo HOSTIA, prueba de nuevo");
			
			else {

				System.out.println("Ahora dame otro para el EXPONENTE: ");

				do {

					exp = Integer.parseInt(sc.nextLine());

					if (exp < 0)
						System.out.println("Vamos no me jodas hombre que lo estabas haciendo muy bien. Te doy otra oportunidad, introduce un nuevo número");

				} while (exp < 0);

			}

		} while (base < 0);

		System.out.println("Muchas gracias");

		System.out.println("La potencia de " + base + " elevado a " + exp + " da: " + potenciaRec(base, exp));

		sc.close();

	}

}