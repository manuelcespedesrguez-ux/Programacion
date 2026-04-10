package boletin;

import java.util.Scanner;

public class Boletin6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double num = 0, suma = 0;
		System.out.println("Introduce un número y se mostrará la suma de todos los números: ");

		do {
			num = Double.parseDouble(sc.nextLine());
			suma += num;	
			if (num != 0) 
				System.out.println("Dame otro número");
		} while (num != 0);
				System.out.println("La suma de todos los números es: " + suma);
		sc.close();
	}

}
