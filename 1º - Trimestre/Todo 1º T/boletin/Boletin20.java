package boletin;

import java.util.Arrays;
import java.util.Scanner;

public class Boletin20 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numero = 0;

		System.out.println("Cuántos sueldos vas a introducir: ");
		numero = Integer.parseInt(sc.nextLine());

		double[] sueldos = new double[numero];

		for (int j = 0; j < sueldos.length; j++) {
			System.out.println("Introduce un sueldo: ");
			sueldos[j] = Integer.parseInt(sc.nextLine());
		}
		
		System.out.println(Arrays.toString(sueldos));
		
		double max = sueldos[0];
		double suma = 0d;
		
		for(Double d : sueldos) {
			suma+=d;
			if(d>max)
				max=d;
		}
		
		System.out.println("El valor máximo es : "+max);
		System.out.println("El sueldo promedio es: "+suma/numero);
		
			sc.close();
	}
}
