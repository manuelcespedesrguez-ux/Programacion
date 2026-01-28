package tres;

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		
		double peso;
		double altura;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Dame peso: ");
		peso = Double.parseDouble(sc.nextLine());
		System.out.println("Dame tu altura: ");
		altura = Double.parseDouble(sc.nextLine());
		
		double imc = peso/(altura*altura);
		
		if(imc<16) System.out.println("Tú IMC es " +imc+ " tienes delgadez severa");
		else if(imc<17) System.out.println("Tú IMC es " +imc+ " tienes delgadez moderada");
		else if(imc<18.5) System.out.println("Tú IMC es " +imc+ " tienes delgadez leve");
		else if(imc<25) System.out.println("Tú IMC es " +imc+ " tienes peso normal");
		else if(imc<30) System.out.println("Tú IMC es " +imc+ " tienes sobrepeso");
		else if(imc<35) System.out.println("Tú IMC es " +imc+ " tienes obesidad leve");
		else if(imc<40) System.out.println("Tú IMC es " +imc+ " tienes obesidad moderada");
		else if(imc<=40) System.out.println("Tú IMC es " +imc+ " tienes obesidad mórbida");
		
		sc.close();
	
	}
	
}
