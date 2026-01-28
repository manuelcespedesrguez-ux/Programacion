package dos;

import java.util.Scanner;

public class Resuelto2 {

	public static double centigradosToFarenheit(double temp) {
		return (9D * temp / 5) + 32;
	}

	public static double fahrenheitToCentigrados(double temp) {
		return (temp - 32) * 5D / 9;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String respuesta;

		do {
			System.out.println("Elige una opción:");
			System.out.println("Convertir C a F (1)");
			System.out.println("Convertir F a C (2)");
			System.out.println("Irme a casa ya que es la hora pollo pollo (3)");
			System.out.print("Opción: ");

			String seleccion = sc.nextLine();

			switch (seleccion) {
			case "1":
				System.out.print("Introduce una temperatura en C: ");
				double c = sc.nextDouble();
				System.out.println("Transformada a F es: " + centigradosToFarenheit(c));
				sc.nextLine();
				break;

			case "2":
				System.out.print("Introduce una temperatura en F: ");
				double f = sc.nextDouble();
				System.out.println("Transformada a C es: " + fahrenheitToCentigrados(f));
				sc.nextLine(); 
				break;

			case "3":
				System.out.println("Chaoo, marchate a casa ya, que es la hora pollo pollo");
				return;

			default:
				System.out.println("Introduce una opción válida!");
			}

			System.out.print("Quieres hacer otra conversión? (si/no): ");
			respuesta = sc.nextLine();

		} while (respuesta.equalsIgnoreCase("si"));

		System.out.println("Chaoo, marchate a casa ya, que es la hora pollo pollo");
	}
}
