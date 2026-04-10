package boletin;

import java.util.Scanner;

public class Boletin16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Dame un número del 1 al 10: ");
		int num = 0;

		do {
			num = Integer.parseInt(sc.nextLine());
			if (num < 1 || num > 10)
				System.out.println("Dame otro número");
		} while (num < 1 || num > 10);
		System.out.println("La tabla de multiplicar del " + num + " es: ");
		for (int i = 0; i <= 10; i++) {
			System.out.println(num + " x " + i + " = " + (num * i));
		}
		sc.close();
	}

}
