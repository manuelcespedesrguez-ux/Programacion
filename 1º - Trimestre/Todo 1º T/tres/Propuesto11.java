package tres;

import java.util.Scanner;

public class Propuesto11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Primer término");
		int primer = Integer.parseInt(sc.nextLine());
		System.out.println("Razón a sumar: ");
		int diferencia = Integer.parseInt(sc.nextLine());
		
		System.out.println("Dime que término quieres obtener: ");
		int ene = Integer.parseInt(sc.nextLine());
		
		int acumula=primer;
		int termino = primer;

		for (int i = 0; i < 51; i++) {
			termino+= diferencia;
			acumula+=termino;
		}
		System.out.println("El término "+ene+" es:"+termino);	
		System.out.println("---------------------");		
		System.out.println(" La suma de los "+ene+" primeros " + "términos de la sucesión es: "+acumula);
		System.out.println("-------------------------------------------------------------");
		int SUMA = (ene/2) * (primer + termino);
		System.out.println("  La suma por fórmula da: "+SUMA);
		
		sc.close();
	}

}
