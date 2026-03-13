package Repaso;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio4 {
    
    // Genera un array de 60 posiciones DOBLES que tomarán valores entre -200 y 200.
    // Separe en dos matrices los valores positivos y negativos. Ordene ambos arrays 
    // por el método de quickSort. Considere el cero positivo. A continuación, separe el array de negativos en dos arrays
    // uno de pares y otro de impares (use casteo); muestre ambos.

    public static void quickSort (double[] array, int izq, int der) {

		if (izq < der) {

			int indicePivote = particion(array, izq, der);

			quickSort(array, izq, indicePivote -1);

			quickSort(array, indicePivote +1, der);

		}

	}

    private static int particion(double [] arreglo, int izq, int der) {

	        // Elegimos el último elemento como pivote
	        double pivote = arreglo[der];
	        int i = (izq - 1);

	        for (int j = izq; j < der; j++) {
	            if (arreglo[j] <= pivote) {
                    i++;

                    // Intercambio
	                double temporal = arreglo[i];
	                arreglo[i] = arreglo[j];
	                arreglo[j] = temporal;
	            }
	        }

	        // Colocar el pivote en su posición final
	        double temporal = arreglo[i + 1];
	        arreglo[i + 1] = arreglo[der];

            arreglo[der] = temporal;

	        return i + 1;
	    }

    public static void main(String[] args) {
        
        double[] array = new double[60];
        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextDouble(-200, 200);
        }

        // Declaración de arrays para positivos y negativos
        double[] positivos = new double[array.length];
        double[] negativos = new double[array.length];

        int posCount = 0;
        int negCount = 0;

        for (double num : array) {
            if (num >= 0) {
                positivos[posCount++] = num;
            } else {
                negativos[negCount++] = num;
            }
        }

        // Ordenamos los arrays mediante quickSort
        if (positivos.length > 0) 
            quickSort(positivos, 0, positivos.length - 1);
        if (negativos.length > 0)
            quickSort(negativos, 0, negativos.length - 1);

        System.out.println("Negativos "+Arrays.toString(negativos));
        System.out.println("Positivos "+Arrays.toString(positivos));

        // Usamos casteo para separar los negativos en pares e impares
        int pares = 0;
        int nones = 0;

        for (int i = 0; i < negativos.length; i++) {
            if (negativos[i] % 2 == 0) {
                pares++;
            } else {
                nones++;
            }
        }

        double[] pareados = new double[pares];
        double[] nonados = new double[nones];

        int pos = 0;
        int neg = 0;

        for (int i = 0; i < negativos.length; i++) {
            if (negativos[i] % 2 == 0) {
                pareados[pos++] = (int) negativos[i];
            } else {
                nonados[neg++] = (int) negativos[i];
            }
        }

        System.out.println("Pares negativos  " + Arrays.toString(pareados));
        System.out.println("Impares negativos " + Arrays.toString(nonados));

    }
}





