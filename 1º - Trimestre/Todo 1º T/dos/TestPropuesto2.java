package dos;

import java.util.Scanner;

public class TestPropuesto2 {

	public static void main(String[] args) {

		Propuesto2 objeto = new Propuesto2(6);
		System.out.println( objeto.toString() );
		Scanner sc = new Scanner (System.in);
		System.out.println("Dame un entero: ");
		int numero=sc.nextInt();
		
		Propuesto2 extraño= new Propuesto2(numero);
		System.out.println(extraño.toString());
		
		Propuesto2 otro= new Propuesto2(objeto);
		System.out.println(otro.toString());
		System.out.println(objeto.toString());
		
		System.out.println( otro.equals(objeto));
		
		sc.close();
		
		
		
	}

}
