package tres;

import java.util.Scanner;

public class Propuesto10 {

	public static boolean esVampiro(int a, int b, int c, int d, int n) {
	
		boolean vampiro = false;
		int Dracula = a*10+b;
		int Frankenstein = c*10+d;
		
		int resultado = Dracula*Frankenstein;
		
		if(resultado==n) {
			vampiro = true;
		}
		else {
			vampiro = false;
		}
		
		return vampiro;
	}
		
	public static void main(String[] args) {
	   
	   	Scanner sc = new Scanner(System.in);
	   	int a=0, b=0, c=0, d=0, n=0;
	   	System.out.println("Dame un número de 4 cifras: ");
	   	n = Integer.parseInt(sc.nextLine());
	   
		a = n / 1000; 
		b = (n % 1000) / 100;
		c = (n % 1000 % 100 ) / 10;
		d = (n % 1000 % 100) % 10;
		
		if(esVampiro(a,b,c,d,n)==true) System.out.println("El número es vampiro");
		else if(esVampiro(b,a,c,d,n)==true) System.out.println("El número es vampiro");
		else if (esVampiro(d,a,b,c,n)==true) System.out.println("El número es vampiro");
		else if (esVampiro(d,c,a,b,n)==true) System.out.println("El número es vampiro");
		else if (esVampiro(a,c,b,d,n)==true) System.out.println("El número es vampiro");
		else if (esVampiro(a,d,c,b,n)==true) System.out.println("El número es vampiro");
		else System.out.println("No es un número vampiro");
		
		sc.close();
   

}
}
