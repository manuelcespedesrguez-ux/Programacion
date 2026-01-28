package boletin;

import java.util.Scanner;

public class Boletin5 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = (int) (Math.random() *1000 + 1), introd = 0, contador = 10;
		System.out.println("Intena adivinar el número entre 1 y 1000");
		
		do {
			introd = Integer.parseInt(sc.nextLine());
			if (introd > num) {
				System.out.println("El número es menor, prueba de nuevo");
				contador --;
			}else if (introd < num) {
				System.out.println("El número es mayor, prueba de nuevo");
				contador --;
			}else if (introd == num) {
				System.out.println("ENHORABUENA, has adivinado el número "+num+" , después de "+contador+" intentos");
			}
		}
		while (introd != 0 && contador > 0);
		System.out.println("Game over, se acabó el juego");
		sc.close();
	}
}
