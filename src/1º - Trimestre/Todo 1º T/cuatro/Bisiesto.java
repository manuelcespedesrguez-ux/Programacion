package cuatro;

import java.util.Scanner;

public class Bisiesto {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el año a comprobar: ");
		int a = sc.nextInt();
		
		System.out.println("El año "+a+" es bisiesto: "+esBisiesto(a));
		
		
		sc.close();
	}
	
	public static boolean esBisiesto(int a) {
		if( a%4==0 && a%100 !=0)
			return true;
		else
			return false;
	}
}
