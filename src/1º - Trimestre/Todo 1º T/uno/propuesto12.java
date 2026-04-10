package uno;

import java.util.Scanner;

public class propuesto12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int cantidad = 0;
		int b500 = 0, b200 = 0, b100 = 0, b50 = 0, b20 = 0, b10 = 0, b5 = 0;

		System.out.println("Dame cantidad: ");
		cantidad = sc.nextInt();
		while (cantidad >= 5) {

			if (cantidad >= 500) {
				b500++; // add un billete de 500
				cantidad -= 500; // cantidad = cantidad -500

			} else if (cantidad >= 200) {
				b200++; // add un billete de 200
				cantidad -= 200; // cantidad = cantidad -200 ;

			} else if (cantidad >= 100) {
				b100++; // add un billete de 100
				cantidad -= 100; // cantidad = cantidad -100

			} else if (cantidad >= 50) {
				b50++; // add un billete de 50
				cantidad -= 50; // cantidad = cantidad -50 ;

			} else if (cantidad >= 20) {
				b20++; // add un billete de 20
				cantidad -= 20; // cantidad = cantidad -20 ;

			} else if (cantidad >= 10) {
				b10++; // add un billete de 10
				cantidad -= 10; // cantidad = cantidad -10 ;

			} else if (cantidad >= 5) {
				b5++; // add un billete de 5
				cantidad -= 5; // cantidad = cantidad -5 ;

			}
		}
		// Salida
		System.out.println("Billete 500: " + b500);
		System.out.println("Billete 200: " + b200);
		System.out.println("Billete 100: " + b100);
		System.out.println("Billete 50: " + b50);
		System.out.println("Billete 20: " + b20);
		System.out.println("Billete 10: " + b10);
		System.out.println("Billete 5: " + b5);
		System.out.println("Monedas: " + cantidad);

	}
}
