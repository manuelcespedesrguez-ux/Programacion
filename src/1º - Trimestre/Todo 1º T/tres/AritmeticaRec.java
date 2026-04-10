package tres;

import java.util.Scanner;

public class AritmeticaRec {

	public static int primer;
	public static int diferencia;
	public static int suma = primer;

	public static int terminoEne(int n) {

		if (n == 1) {

			return primer;

		} else {

			return terminoEne(n - 1) + diferencia;

		}
	}

	public static int sumaHastaEne(int n) {
		if (n == 1) {
			return primer;
		} else {
			return terminoEne(n) + sumaHastaEne(n - 1);
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Primer término");
		int primer = Integer.parseInt(sc.nextLine());
		System.out.println("Razón a sumar: ");
		int diferencia = Integer.parseInt(sc.nextLine());

		System.out.println("Dime que término quieres obtener: ");
		int ene = Integer.parseInt(sc.nextLine());

		System.out.println("La suma de los "+ene+ " primeros " + " términos de la sucesion es: "+sumaHastaEne(ene));
		
		sc.close();
	}

}
