package uno;

import java.util.Scanner;

public class Operaccion {

	public static void main(String[] args) {
		
		Scanner pedir= new Scanner (System.in);
		int m=2, n=5;
		boolean res;
		
		System.out.println("introduce un numero");
		n=pedir.nextInt();
		
		System.out.println("introduce un numero");
		m=pedir.nextInt();
		
		res =(m > n);
		System.out.println("la expresion es: "+res);//res=false
		
		res =(m < n);
		System.out.println("la expresion es: "+res);//res=true
		
		res =(m >= n);
		System.out.println("la expresion es: "+res);//res=false
		
		res =(m <= n);
		System.out.println("la expresion es: "+res);//res=true
		
		res =(m == n);
		System.out.println("la expresion es: "+res);//res=false
		
		res =(m != n);
		System.out.println("la expresion es: "+res);//res=true
		
	}
}
