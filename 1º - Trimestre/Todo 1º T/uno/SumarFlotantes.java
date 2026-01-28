package uno;

import java.util.Scanner;

public class SumarFlotantes {
	
	
	
	
	final static double PI=3.141592;
	
public static void main(String[] args) {
	
	float num1,num2,suma,radio;
	try (Scanner lector = new Scanner(System.in)) {
		//pedir entradas 
		System.out.println("introduce el primer radio con decimales: ");
		num1=      lector.nextFloat();
		
		System.out.println("introduce el segundo radio con decimales");
		num2=      lector.nextFloat();
		
		//algoritmo de la suma
		//suma =  num1+num2;
		
		//ver resultado
		
		System.out.println("introduce radio");
		radio= lector.nextFloat();
	}
	
	
	//Pide entradas
	
	System.out.println("la longitud de la circunferencia es " +PI*radio*2);
	
	//muestra resultado
	
	System.out.println("el area es "+PI*radio*radio);
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
