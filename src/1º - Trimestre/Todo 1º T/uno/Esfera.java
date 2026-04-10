package uno;

import java.util.Scanner;
import java.math.*;

public class Esfera {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double area, volumen, radio, numero = 4, num2 = 3;
		
		System.out.println("Introduce el radio");
		radio = sc.nextFloat();
		
		area = numero * (Math.PI * (Math.pow(radio, 2)));
		volumen = ((numero / num2) * Math.PI) * Math.pow(radio, 3);
		
		System.out.println("El área es: " + area);
		System.out.println("El volumen es: " + volumen);

	}

}
