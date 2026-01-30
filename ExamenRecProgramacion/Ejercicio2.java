package ExamenRecProgramacion;

import java.util.Scanner;

public class Ejercicio2 {
    
    


    	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame tu salario anual bruto");
		
		System.out.println("Dime tu edad");
		
		System.out.println("Dime número de hijos dependientes ");
		
		System.out.println("Tienes seguro médico? ");
		double k = sc.nextDouble();
		
	    System.out.println("Contribución plan de pensiones? ");
	    double pg = sc.nextDouble();
		
		sc.close();
		
	}
}
