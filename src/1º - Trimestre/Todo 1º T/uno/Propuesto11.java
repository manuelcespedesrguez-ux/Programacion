package uno;

import java.util.Scanner;

public class Propuesto11 {

	public static void main(String[] args) {

		int t=0;
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Introduce una cantidad de segundos: ");
		t= scanner.nextInt();
		
		//int cociente = t/60;
	    //int resto = t%60;
	    
	    //System.out.println("Minutos: " +cociente);
	    //System.out.println("Segundos: " +resto);
	    
	    //int cocicociente = cociente/60;
	    //int cociresto = cociente%60;
	    
	   // System.out.println("Días: " +cocicocicociente);
	   //System.out.println("Horas: " + (t/60)/60);
	   //System.out.println("Minutos: " + (t/60)%60);
	   //System.out.println("Segundos: " + t%60);
		
		int dias = ( (t/60)/60 / 24);
		int horas = ( (t/60)/60 ) %24;
		
		System.out.println("Días: " +dias);
		System.out.println("Horas: " + horas);
		
	}

}
