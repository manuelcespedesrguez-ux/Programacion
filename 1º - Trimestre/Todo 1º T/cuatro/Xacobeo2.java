package cuatro;

import java.util.Arrays;
import java.util.Scanner;

public class Xacobeo2 {

	public static final int[] AÑOS_XACOBEOS = { 1909,1915,1920,1926,1937,1938,1943,1948,1954,1965,1971,1976,1982,1993,1999,
			2004,2010,2021,2027,2032,2038,2049,2055,2060,2066,2077,2083,2088,2094};
	public static void main(String[] args) {
		
		System.out.println("Comprobar si el año es Xacobeo con API stream");
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el año que quieres comprobar: " );
		int añoBuscado = sc.nextInt();
		boolean enArray = Arrays.stream(AÑOS_XACOBEOS).anyMatch(a -> a == añoBuscado);
		if(enArray) {
			System.out.println(añoBuscado + " está en el array.");
		}else {
			System.out.println(añoBuscado + " no está en el array.");
		}
		
		sc.close();
	}

}
