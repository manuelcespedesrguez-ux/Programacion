package uno;

import java.util.Scanner;

public class Resueltos {

	public static void main(String[] args) {
		
		//Variables
		Scanner sc= new Scanner(System.in);
		int edad=0, nivel_de_estudios=0, ingresos=0;
		boolean jasp;
		
		//Entradas
		System.out.println("Dame tu edad: ");
		edad= sc.nextInt();
		System.out.println("Dame tu nivel de estudios: 1 a 6");
		nivel_de_estudios= sc.nextInt();
		System.out.println("Dame tus ingresos: ");
		ingresos= sc.nextInt();
		
		//Algoritmo
		jasp = (edad<=28) && (nivel_de_estudios>3) && (ingresos>28000) ;
		
		//Salida
		if(jasp)
			System.out.println("Eres un crack chavalote");
		else
			System.out.println("No pasa nada, tu mamá te quiere");
	}

}
