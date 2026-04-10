package uno;

import java.util.Random;

public class Propuesto8 {

	public static char getLetras() {
		return (char) (Math.random() * 26 + 'a');
	}

	public static void main(String[] args) {

		Random rand = new Random();
		int veces = rand.nextInt(10) + 3;
		int contVoc = 0;
		int contCons = 0;

		for (int i = 0; i < veces; i++) {

			char letra = getLetras();
			if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
				System.out.println("El caracter " + letra + " es una vocal");
				contVoc++;
			}

			else {
				System.out.println("El caracter " + letra + " es una consonante");
				contCons++;
			}
		}
		System.out.println("---------------------------------");
		System.out.println("Hubo " +contVoc+ " vocales");
		System.out.println("Hubo " +contCons+ " consonantes");
	}
}
