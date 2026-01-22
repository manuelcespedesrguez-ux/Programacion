package Ordenamiento;
import java.util.Arrays;
import java.util.Random;

public class QuickSort {

	public static void quickSort (int[] array, int izq, int der) {

		if (izq < der) {

			int indicePivote = particion(array, izq, der);

			quickSort(array, izq, indicePivote -1);

			quickSort(array, indicePivote +1, der);

		}

	}

	 private static int particion(int[] arreglo, int izq, int der) {

	        // Elegimos el último elemento como pivote
	        int pivote = arreglo[der];
	        int i = (izq - 1);

	        for (int j = izq; j < der; j++) {
	            if (arreglo[j] <= pivote) {
                    i++;

                    // Intercambio
	                int temporal = arreglo[i];
	                arreglo[i] = arreglo[j];
	                arreglo[j] = temporal;
	            }
	        }

	        // Colocar el pivote en su posición final
	        int temporal = arreglo[i + 1];
	        arreglo[i + 1] = arreglo[der];

            arreglo[der] = temporal;

	        return i + 1;
	    }

	public static void main(String[] args) {

		int[] datos = { 2, 5, 0, 9, 3, 1, 8, 4, 7, 6, 2, 5, 9, 0, 3, 1, 4, 7, 8, 2 };
		System.out.println(Arrays.toString(datos));
		quickSort(datos, 0, datos.length -1);
		System.out.println(Arrays.toString(datos));

		int[] numeros = new int[1000000];

		for (int i = 0; i<numeros.length; i++) {

			numeros[i]=((int)(Math.random()*10000+1));

		}

		System.out.println(Arrays.toString(numeros));

		quickSort(numeros, 0, numeros.length-1);

		System.out.println(Arrays.toString(numeros));
	}
}

