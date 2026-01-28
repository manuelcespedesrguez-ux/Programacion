package uno;

import java.util.Scanner;

public class Propuesto5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner (System.in);
		double radio=0d;
		double longitud=0d, area=0d;
		
		System.out.println("Dame un radio: ");
		radio= scanner.nextDouble();
		
		//Algoritmo
		longitud= 2* Math.PI * radio;
		area = Math.PI * Math.pow(radio, 2);
		
		//Salidas
		System.out.println("longitud: " + longitud);
		System.out.println("area: " + area);
				
	}

}
