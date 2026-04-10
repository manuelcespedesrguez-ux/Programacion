package EjerciciosExamen;

import java.util.Scanner;

public class Ejercicio1 {
			
		public static int sumaDivisoresP(int n) {
			
			int suma=0;
			for (int j = 1; j <= n; j++) {
				if (n  % j == 0)
					System.out.println(j + ", ");
				}
			return suma;
			}

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Introduce un entero positivo: ");
			int entero1 = Integer.parseInt(sc.nextLine());

			System.out.println("El número " + entero1 + " tiene los siguientes divisores: ");

			for (int j = 1; j <= entero1; j++) {
				if (entero1 % j == 0)
					System.out.println(j + ", ");
			}

			Scanner sc1 = new Scanner(System.in);
			System.out.println("Introduce un entero positivo: ");
			int entero2 = Integer.parseInt(sc.nextLine());

			
			System.out.println("El número " + entero2 + " tiene los siguientes divisores");
			
			for (int j = 1; j <= entero2; j++) {
				if (entero2 % j == 0)
					System.out.println(j + ", ");
			}

			
			sc.close();
			sc1.close();
		}

	
}

