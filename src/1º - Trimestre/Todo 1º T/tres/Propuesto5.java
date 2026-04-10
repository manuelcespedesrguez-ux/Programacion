package tres;

import java.util.Scanner;

public class Propuesto5 {

	public static int divideSumaDigitos(int num) {
		int suma = 0;
		do {
			suma += (num % 10);
			num = num / 10;
		} while (num > 0);
		return suma;
	}

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int dia = 1, mes = 1, ano = 1850, lucky = 0, luckyfinal = 0;

		do {
			if (dia < 1 || dia > 31) {
				System.out.println("El día es incorrecto, inténtalo de nuevo");
			}
			System.out.println("Escribe el día: DD");
			dia = Integer.parseInt(teclado.nextLine());
		} while (dia < 1 || dia > 31);

		do {
			if (mes < 1 || mes > 12) {
				System.out.println("El mes es incorrecto, inténtalo de nuevo");
			}
			System.out.println("Escribe el mes: MM");
			mes = Integer.parseInt(teclado.nextLine());
		} while (mes < 1 || mes > 12);

		do {
			if (ano < 1850) {
				System.out.println("Eres demasiado viejo, inténtalo de nuevo");
			}
			if (ano > 2050) {
				System.out.println("Aún no has nacido chaval, no se puede calcular tu lucky number, ESPABILA");
			}
			System.out.println("Escribe el año: YYYY");
			ano = Integer.parseInt(teclado.nextLine());
		} while (ano < 1850 || ano > 2050);

		lucky = (divideSumaDigitos(dia) + divideSumaDigitos(mes) + divideSumaDigitos(ano));

		if (lucky > 9) {
			luckyfinal = divideSumaDigitos(lucky);
			System.out.println("Tu Lucky Number es: " + luckyfinal);
		} else if (lucky < 10) {
			luckyfinal = lucky;
			System.out.println("Tu Lucky Number es: " + luckyfinal);
		}

		teclado.close();
	}
}