package tres;

import java.util.Scanner;

public class EjercicioPropuesto17 {

	public static int primer;
	public static int razon;

	public static int terminoEne(int n) {

		if (n == 1) {

			return primer;

		} else {

			return terminoEne(n - 1) * razon;

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
		System.out.println("Primer término: ");
		primer = Integer.parseInt(sc.nextLine());
		System.out.println("Razón por la que quiero multiplicar: ");
		razon = Integer.parseInt(sc.nextLine());

		System.out.println("Dime que término deseas obtener: ");
		int ene = Integer.parseInt(sc.nextLine());

		double aux = primer;
		double termino = primer;
		double acumula = primer;
		
		for (int i = 1; i < ene; i++) {
			System.out.println(termino + ", ");
			termino += i / aux;
			acumula+=termino;
		}

		System.out.println("El término " + ene + " es: " + terminoEne(ene));

		System.out.println("La suma de los " + ene + " primeros términos de la sucesión es: " + acumula);

		sc.close();
	}
}
