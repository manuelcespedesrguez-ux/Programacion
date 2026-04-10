package tres;

import java.util.Scanner;

public class Armstrong {

	public static boolean  isArmstrong(int num) {

		int centenas = num / 100;
		int decenas = (num % 100) / 10;
		int unidades = (num % 100) % 10;
		System.out.println("La centena es: " + centenas);
		System.out.println("La decena es: " + decenas);
		System.out.println("La unidad es: " + unidades);
		int Armstrong = (int) (Math.pow(centenas, 3) + Math.pow(decenas, 3) + Math.pow(unidades, 3));
		if (num == Armstrong)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = 0;

		do {
			System.out.println("Dame un número entero de tres cifras: ");
			x = Integer.parseInt(sc.nextLine());
		} while (x < 100 || x > 999);

		System.out.println("Has introducido este número: " +x+" el número es Armstrong? "+isArmstrong(x));

		

//		if (Armstrong == num) {
//			System.out.println(num + "Es un número de Armstrong");
//		} else
//			System.out.println(num + "Es un número normal");

		sc.close();

	}
}