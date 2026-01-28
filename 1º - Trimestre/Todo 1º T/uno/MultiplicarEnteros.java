package uno;

import java.util.Scanner; 

public class MultiplicarEnteros {
	public static void main(String[] args) {
	
	        float num1,num2,multiplicacion;
	        try (Scanner lector = new Scanner(System.in)) {
				System.out.println("introduce el primer entero");
				num1=     lector.nextFloat();

				System.out.println("introduce el segundo entero");
				num2=     lector.nextFloat();
			}
	
	        //algoritmo de la multiplicacion
	        multiplicacion=  num1*num2;
	
	       //ver resultado
	       System.out.println("la multiplicacion de ambos numeros es: "+multiplicacion);
    }


}
