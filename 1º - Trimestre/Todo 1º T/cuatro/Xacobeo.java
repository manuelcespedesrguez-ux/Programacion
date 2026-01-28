package cuatro;

import java.util.Scanner;

public class Xacobeo {

	public static void main(String[] args) {
		
		System.out.println("Comprobar si el año es Xacobeo: ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el año que quieres comprobar: " );
		int a = sc.nextInt();
		
		System.out.println("El año "+a+" es bisiesto: "+esXacobeo(a));
		
		sc.close();
	}
	
	private static boolean esXacobeo(int anyo) {
//		if (anyo )
//			return true;
//		else
//			return false;
//	}
	
	for (int a=0; a<AÑOS_XACOBEOS.length; a++) {
		if (AÑOS_XACOBEOS[a] == anyo) {
			return true;
		}
	}
	return false;
	}
		
	public static final int[] AÑOS_XACOBEOS = {
			1909,1915,1920,1926,1937,1938,1943,1948,1954,1965,1971,1976,1982,1993,1999,2004,2010,2021,2027,2032,2038,2049,2055,2060,2066,2077,2083,2088,2094};
}


