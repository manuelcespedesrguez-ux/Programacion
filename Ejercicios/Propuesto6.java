package Ejercicios;

import java.util.Scanner;

public class Propuesto6 {

	public static boolean esCapicua(int dato) {
	    String original = String.valueOf(dato);
	    String reverse = new StringBuilder(original).reverse().toString();
	    return original.equals(reverse);
	}
	
}