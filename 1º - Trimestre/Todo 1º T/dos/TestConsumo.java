package dos;

import java.util.Scanner;

public class TestConsumo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Centralita a cero");
		
		System.out.println("Dame lecturas del viaje");
		
		System.out.println("Dime litros consumidos: ");
		
		System.out.println("Kilómetros: ");
		double k = sc.nextDouble();
		
	    System.out.println("Precio litro: ");
	    double pg = sc.nextDouble();
	    
	    System.out.println("Velocidad promedio del vehículo: ");
	    double vm = sc.nextDouble();
	    
	    System.out.println("Litros consumidos: ");
	    double L = sc.nextDouble();
	    
	    Consumo sumo = new Consumo(k, pg, vm, L);
	    
	    System.out.println(sumo.toString());
		
		sc.close();
		
	}
	
}
