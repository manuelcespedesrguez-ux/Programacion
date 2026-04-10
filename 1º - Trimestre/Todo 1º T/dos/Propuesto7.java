package dos;

import java.util.Scanner;

public class Propuesto7 {

	public static float millasAMetros( float marinas ) {
		
		//1 marina ----------> 1852 metros
		//100 marinas -------> x
		
		//x= 100*1852 / 1
		
		return marinas*1852/1;
		
	}
	
	public static float millasAKilometros(float millas) {
		
		return millasAMetros(millas)/1000;
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce las millas marinas a convertir: ");
		float millas = Float.parseFloat(sc.nextLine());
		System.out.println("Esas millas marinas en metros son: "+ millasAMetros(millas) +" metros");
		
		System.out.println("Introduce las millas marinas a convertir: ");
		millas = Float.parseFloat(sc.nextLine());
		System.out.println("Esas millas marinas en kilómetros son: "+ millasAKilometros(millas) +" kilómetros");
		
		sc.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
