package boletin;

import java.util.Scanner;

public class Boletin8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = 0;
		System.out.println("Dame un número: ");
		num = Integer.parseInt(sc.nextLine());
		
		for (int i = 1; i <= num; i++) {
			System.out.println("Estos son todos los números desde 1 hasta " + num);
			System.out.println(i);
		}
		sc.close();
	}
}