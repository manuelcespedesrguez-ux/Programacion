package uno;

import java.util.Scanner;

public class SumarNumeros {
	
	
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Suma y producto de enteros desde 1---hasta---");
		System.out.println("Introduce hasta que numero quieres sumar: ");
		int numero=sc. nextInt();
		
		long producto=1; //OJO
		long suma=0; //de
		int contador=0; //HALCON
		
		for (int i=contador+1; i<=numero; i++) {
			suma=suma+i; //suma=suma+i;
			contador++; //añade una unidad al contador
			producto*=i; //producto=producto*i
			//System.out.println("Suma parcial: "+suma);
		}
		
        System.out.println("La suma da: "+suma+ " para los primeros "+contador+ " numeros");
        System.out.println("El producto da: "+producto+ " para los primeros "+contador+ " numeros");
	}
	

}
