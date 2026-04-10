package tres;

import java.util.Scanner;

public class Propuesto9 {

	public static int cuentaDigitos(int num) {
		int digitos = 0;

		while (num > 0) {
			num = num / 10;
			digitos++;
		}
		return digitos;
	}


	public static int invierteOrdenNumero(int n) {
		
		int pot=cuentaDigitos(n)-1;
		int reverse=0;
		while( n >0) {
			int cifra=n%10;
			n /= 10;
			reverse+= cifra*Math.pow(10, pot);
			pot--;
		}
		return reverse;
	}

	public static boolean esPrimo(int n) {
		boolean primo = true;
		int cociente = 2;
		while(cociente<n) {
			if(n%cociente==0) {
				primo = false; 
				return primo;
			}
			cociente++;
		}
		return primo;
	}
	
	public static boolean esOmirp(int n) {
		if(esPrimo(n) && esPrimo(invierteOrdenNumero(n)))
			return true;
		else return false;
	}
	
	public static void main(String[] args) {
		
		int n=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número");
		 n = Integer.parseInt(sc.nextLine());
		 
		 System.out.println("Dicho número escrito al revés es: "+invierteOrdenNumero(n));
		 System.out.println(" ");
		 System.out.println("El número es Omirp? "+esOmirp(n));
		 System.out.println(" ");
		
		 System.out.println("Lista de los primos entre 1 y 100");
		 System.out.println(" ");
		 for(int i=0; i<=100; i++) {
			 if(esPrimo(i))
				 System.out.println(i+" Es número primo");
		 }
	
		 sc.close();
		 
	}

	
		
	}

	
