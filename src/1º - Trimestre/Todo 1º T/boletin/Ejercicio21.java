package boletin;

import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		 // 1. Inicialización
//	    // La bandera se pone en FALSO inicialmente. 
//	    // Cambiará a VERDADERO solo si se encuentra un negativo.
//	    Definir SeEncontroNegativo Como Logico
//	    SeEncontroNegativo <- FALSO

		boolean atopado = false;

//	    // 2. Proceso Iterativo (Bucle FOR)
//	    Para i Desde 1 Hasta 10 Hacer
//	        Escribir "Introduce el número ", i, " de 10:"
//	        Leer Numero

		for (int i = 1; i <= 10; i++) {
			System.out.println("Introduce el numero " + i + " de 10");
			int numero = Integer.parseInt(sc.nextLine());
			if (numero < 0) {
				atopado = true;
				break;
			}
		}

//	        
//	        // 3. Verificación de Condición
//	        Si Numero < 0 Entonces
//	            // Si el número es negativo, levantamos la bandera
//	            SeEncontroNegativo <- VERDADERO
//	            // (Opcional) Si solo queremos saber si hay *alguno* negativo,
//	            // podemos salir del bucle para ahorrar tiempo.
//	            // Salir del Para (o Interrumpir)
//	        Fin Si
//	        
//	    Fin Para
//	    
//	    // 4. Salida / Resultado
//	    Escribir "--- Resultado ---"
//	    Si SeEncontroNegativo Es VERDADERO Entonces
//	        Escribir "¡ATENCIÓN! Se introdujo al menos un número negativo."
//	    Sino
//	        Escribir "Todos los números introducidos fueron cero o positivos."
//	    Fin Si

		if (atopado)
			System.out.println("Se ha metido un negativo");
		else
			System.out.println("todos los numeros fueron positivos");

//	    
//	Fin Algoritmo*/

		sc.close();
	}


}
