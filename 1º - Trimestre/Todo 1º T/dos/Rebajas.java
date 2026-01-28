package dos;

import java.util.Scanner;

public class Rebajas {

	public static double descubrePorcentaje(double original, double actual) {
		return (original - actual) * 100 / original;
	}

	public static double precioFinal(double original, double porcentaje) {
		return original * (1 - (porcentaje / 100));
	}

	public static double precioOriginal(double actual, double porcentaje) {
		return actual / (1 - (porcentaje / 100));
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double original = 0D;
		double actual = 0D;
		double porcentaje = 0D;
		System.out.println("Método descubre porcentaje");

		System.out.println("Dame original: ");
		original = sc.nextDouble();
		System.out.println("Dame actual: ");
		actual = sc.nextDouble();

		System.out.println("El porcentaje de descuento es..." + descubrePorcentaje(original, actual));

		System.out.println("Probamos otro método dame precio final");
		System.out.println("Dame original: ");
		original = sc.nextDouble();
		System.out.println("Dame porcentaje: ");
		porcentaje = sc.nextDouble();
		System.out.println("El precio final es... " + precioFinal(original, porcentaje));

		sc.close();
	}

}
