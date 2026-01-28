package dos;

import java.util.Scanner;

public class Propuesto11 {
	
	//Ejercicio 11 El restaurante mejicano de Lukas
	//cuya especialidad sonas las patatas con chocos nos pide diseñar un método
	//con el que se pueda saber cuántos clientes puede atender Lukas con la materia 
	//prima que tienen en el almacén.
	//El método recibe la cantidad de patatas y chocos en kilos y devuelve el número
	//de clientes que puede atender el restaurante teniendo en cuenta 
	//que por cada tres personas, Lukas utiliza un kilo de patatas y medio kilo de chocos.

	public static int numeroDePatatasYChocos(double kilosPatatas, double kilosChocos) {
		int numDef = 0;
		if (kilosPatatas >= 1 && kilosChocos >= 0.5) {
			double numPP = kilosPatatas / 1;
			double numPC = kilosChocos / 0.5;
			if (numPP > numPC) {
				numDef = (int) numPC * 3;
			} else if (numPC > numPP) {
				numDef = (int) numPP * 3;
			} else if (numPP == numPC) {
				numDef = (int) numPP * 3;
			}
		}
		return numDef;
	}

	public static void main(String[] args) {

		double chocos = 0, patatas = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Número de kilos de patatas");
		patatas = sc.nextDouble();
		System.out.println("Número de kilos de chocos");
		chocos = sc.nextDouble();

		System.out.println("Con esta cantidad pueden comer " + numeroDePatatasYChocos(patatas, chocos) + " personas");

		sc.close();
	}

}

	

