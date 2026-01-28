package boletin;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sumaEdades=0;
		int sumaAlturas=0;
		int contMayor18=0;
		int contMas175=0;
		
		for(int i=0; i<5; i++) {
			System.out.println("Dame edad (años): ");
			int edad = Integer.parseInt(sc.nextLine());
			System.out.println("Dame altura (cms): ");
			int altura = Integer.parseInt(sc.nextLine());
			sumaEdades+= edad;
			sumaAlturas+= altura;
			
			if(edad>18)
				contMayor18++;
			if(altura >175)
				contMas175++;
		}
		
		double edadMedia = (double) sumaEdades / 5;
		double estaturaMedia = sumaAlturas / 5;
		
		System.out.println("Edad media: "+edadMedia+",");
		System.out.println("Estatura media: "+estaturaMedia+",");
		System.out.println("Alumnos mayores de 18: "+contMayor18);
		System.out.println("Alumnos con altura > 175: "+contMas175);
		
		sc.close();
	}
	
}
