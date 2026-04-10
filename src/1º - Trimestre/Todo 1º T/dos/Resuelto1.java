package dos;

import java.util.Scanner;

public class Resuelto1 {

	public static double centigradosToFarenheit(double temp) {

		return (9D * temp / 5) + 32;

	}

	public static double fahrenheitToCentigrados(double temp) {

		return (temp - 32) * 5D / 9;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String respuesta=null;
		
		do {
			
		System.out.println("Convertir c a f (1)/ Convertir f a c(2)/ A casa que es la hora pollo pollo (3)");
        String seleccion= sc.nextLine();
        
        switch(seleccion) {
        
        case "1":
        	System.out.println("Introduce una temperatura en C: ");
    		double c = sc.nextDouble();
    		System.out.println("Transformada a F es: " + centigradosToFarenheit(c));
    		break;
        case "2": 
        	System.out.println("Introduce una temperatura en F: ");
    		double f = sc.nextDouble();
    		System.out.println("Transformada a C es: " + fahrenheitToCentigrados(f));
    		break;
        case "3":
        	System.out.println( );
        	
    	default:
    		System.out.println("Introduce una opción válida!");
        
        }
		System.out.println("Introduce una temperatura en C: ");
		double c = sc.nextDouble();
		System.out.println("Transformada a F es: " + centigradosToFarenheit(c));

		System.out.println("Introduce una temperatura en F: ");
		double f = sc.nextDouble();
		System.out.println("Transformada a C es: " + fahrenheitToCentigrados(f));
        sc.nextLine();
		System.out.println("Otra vez??: ");
		respuesta= sc.nextLine();
		
		} while(respuesta.equals("si"));
		
		
		System.out.println("Chaoo...");
	}

}
