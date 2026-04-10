package tres;

import java.util.Scanner;

public class Resuelto2Bis {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		System.out.println("Dame el número de filas que quieres que tenga el abeto: ");
		int filas = Integer.parseInt(sc.nextLine());
		
		for (int i=0; i<filas; i++) {
			for (int k = filas-1 ; k>i; k--) {
			System.out.print(" ");
		}
	
		for (int j=0; j<2*i+1; j++) {
		System.out.print("*");
	}
	    System.out.println();
	}

		sc.close();
	}

}
