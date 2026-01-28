package cuatro;

import java.util.Scanner;

public class BuscarNumeroArray {
	
	public static void main(String[] args) {
		
		int[] datos = {1,2,3,3,4,4,5,2};
		int largo = datos.length;
		
		int numero = 0;
		
		System.out.println("Búsqueda de nñumero...");
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Introduce el número entero: ");
			numero = Integer.parseInt(sc.nextLine());
		}while (numero < 0 || numero > 1000);
		
		boolean esta = false;
		for(Integer pillo: datos) {
			if(pillo==numero)
				esta=true;
		}
		
		System.out.println("El número "+numero+" está en el array?? "+esta);
	}
	

}
