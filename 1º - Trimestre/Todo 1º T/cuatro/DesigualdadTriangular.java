package cuatro;

import java.util.Scanner;

public class DesigualdadTriangular {

	public static boolean isTriangle(double a, double b, double c) {
		
		if( (a<=b+c) && (b<=a+c) && (c<=a+b))
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame un lado A: ");
		int a = Integer.parseInt(sc.nextLine());
		System.out.println("Dame un lado B: ");
		int b = Integer.parseInt(sc.nextLine());
		System.out.println("Dame un lado C: ");
		int c = Integer.parseInt(sc.nextLine());
	
		System.out.println("Es un triángulo?" +isTriangle(a,b,c));
		
		sc.close();
	}
	
}
