package dos;

import java.util.Scanner;

public class Propuesto1 {

	public final static double DOLAR_POR_EURO = 1.17;

	public static double eurosADolares(double euros) {
		return DOLAR_POR_EURO * euros;
	}

	public static double dolaresAEuros(double dolares) {
		return dolares / DOLAR_POR_EURO;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean sigue = true;

		do {

			System.out.println("Bienvenido\nConvertir a dólares(1)\nConvertir a euros(2)\nSalir(3)\n");
			String resp = sc.nextLine();

			switch (resp) {

			case "1":
				System.out.println("Introduce euros: ");
				double euros = sc.nextDouble();
				System.out.println("Pasado a dolares es: " + eurosADolares(euros));

			case "2":
				System.out.println("Introduce dólares: ");
				double dolares = sc.nextDouble();
				System.out.println("Pasado a euros es: " + dolaresAEuros(dolares));

			case "3":
				System.out.println("Saliendo del convertidor...");
				sigue = false;
				break;

			default:
				System.out.println("ESA OPCIÓN NO VALE CAMPEÓN");
				break;
			}

		} while (sigue);

		System.out.println("Chao campeón");
		sc.close();

	}

}
