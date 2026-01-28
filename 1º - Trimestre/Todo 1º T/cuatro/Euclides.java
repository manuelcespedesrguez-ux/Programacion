package cuatro;

import java.util.Scanner;

public class Euclides {

	public static int euclidesMCD(int n1, int n2) {
		int mcd = 0;
		if (n1 == 0) {
			mcd = n2;
			return mcd;
		} else if (n2 == 0) {
			mcd = n1;
			return mcd;
		} else if (n1 != 0 && n2 != 0) {
			return euclidesMCD(n2, n1 % n2);
		}
		return mcd;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero");
		int uno = Integer.parseInt(sc.nextLine());
		System.out.println("Introduce otro numero y se calculará su MCD");
		int dos = Integer.parseInt(sc.nextLine());

		System.out.print("El MCD de ambos numeros es: ");
		System.out.println(euclidesMCD(uno, dos));
		
	sc.close();
	}

}
