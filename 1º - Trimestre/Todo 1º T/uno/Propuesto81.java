package uno;

import java.util.Random;

public class Propuesto81 {

	public static char getLetras() {
		return (char) (Math.random() * 26 + 'a');
	}

	public static void main(String[] args) {

		Random rand = new Random();
		int veces = rand.nextInt(10) + 3;
		int contVocs = 0;
		int contCons = 0;

		for (int i = 0; i < veces; i++) {

			char letra = getLetras();
			/*
			 * if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra ==
			 * 'u') { System.out.println("El caracter " + letra + " es una vocal");
			 * contVoc++; }
			 * 
			 * else { System.out.println("El caracter " + letra + " es una consonante");
			 * contCons++; } }
			 */
		     switch(letra) {
		     case 'a','e','i','o','u':
		    	 System.out.println("El caracter " + letra + " es una vocal.");
		     contVocs++;
		     break;
		     default: 
		    	 System.out.println("El caracter " + letra + " es una consonante.");
		    	 contCons++;
		    	 break;
		     }
		     /*fin bucle*/
		}
	
		//salidas
		System.out.println("El número de vocales es " + contVocs + " y el de consonantes es " + contCons);
	}
}
 