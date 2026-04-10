package tres;

import java.util.Scanner;

public class Fibonacci {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime que termino deseas obtener: ");
		int ene= Integer.parseInt(sc.nextLine());
		
		if (ene == 0)
			System.out.println("El término es: "+0);
		if(ene == 1)
			System.out.println("El término es: "+1);
		
		int a = 0;
		int b = 1;
		
		for (int i = 2; i <= ene; i++) {
		int siguiente = a + b;
		a = b;
		b = siguiente;
		
	}
		
		System.out.println("El término es: "+b);
		
    sc.close();
	}
}
