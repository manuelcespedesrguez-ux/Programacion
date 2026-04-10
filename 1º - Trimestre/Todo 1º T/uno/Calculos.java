package uno;

 import java.util.Scanner;
public class Calculos {
	
	public static double calculaLongCirc (double radio) {
		double longitud = 0d;
		longitud = 2 * Math.PI * radio;
		return longitud;
				
	}

	public static double calculaAreaCirc (double radio) {
		double area = 0d;
		area = Math.PI * Math.pow(radio, 2);
		return area;

	}
	
	public static void main(String[] args) {
		
		double radio;
		System.out.println("Introduce el radio de la circunferencia");
		Scanner sc= new Scanner(System.in);
		radio = sc.nextDouble();
		
		System.out.println("La longitud es " +calculaLongCirc (radio));
		System.out.println("El area es " +calculaAreaCirc(radio));
	}
}

	

 

 
