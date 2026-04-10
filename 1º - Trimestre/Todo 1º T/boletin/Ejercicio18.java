package boletin;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int[] notas = new int[6];
		
		for(int j=0; j<notas.length; j++) {
			System.out.println("Introduce una nota entera (0 a 9): ");
			notas[j] = Integer.parseInt(sc.nextLine());
			
			sc.close();
		}
		
		System.out.println(Arrays.toString(notas));
		
		int num_susp=0;
		int num_cond=0;
		int num_aprox=0;
		
		for(int k=0; k<notas.length; k++) {
			if(notas[k]<4)
				num_susp++;
			else if(notas[k]==4)
				num_cond++;
			else
				num_aprox++;
		}
		
		System.out.println("Número de aprobados: "+num_aprox);
		System.out.println("Número de condicionados: "+num_cond);
		System.out.println("Número de suspensos: "+num_susp);
	}
	
}
