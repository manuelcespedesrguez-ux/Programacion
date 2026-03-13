package Repaso;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio3 {

    @SuppressWarnings("ManualArrayToCollectionCopy")
    public static float[] mergeSort(float array[]) {
        if (array.length > 1) {
            int elementsInA1 = array.length / 2;
            int elementsInA2 = array.length - elementsInA1; 
            float arr1[] = new float[elementsInA1];
            float arr2[] = new float[elementsInA2];

            for (int i = 0; i < elementsInA1; i++) {
                arr1[i] = array[i];
            }

            for (int i = 0; i < elementsInA2; i++) {
                arr2[i] = array[i + elementsInA1];
            }

            arr1 = mergeSort(arr1);
            arr2 = mergeSort(arr2);

            int i = 0, j = 0, k = 0;

            while (j < arr1.length && k < arr2.length) {
                if (arr1[j] < arr2[k]) {
                    array[i] = arr1[j];
                    j++;
                } else {
                    array[i] = arr2[k];
                    k++;
                }
                i++;
            }
            while (j < arr1.length) {
                array[i] = arr1[j];
                i++;
                j++;
            }
            while (k < arr2.length) {
                array[i] = arr2[k];
                i++;
                k++;
            }
        }
        return array;
    }

    public static void main(String[] args) {

        int tama = 50;
        float[] numeros = new float[tama];
        Random rand = new Random();

        for (int i = 0; i < numeros.length; i++) {
            // Genera entre -100 y 100
            numeros[i] = rand.nextFloat() * 200 - 100;
        }

        // Primero ordenamos el array general 
        mergeSort(numeros);
        System.out.println(Arrays.toString(numeros));

        int posCount = 0;
        int negCount = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] >= 0) {
                posCount++;
            } else {
                negCount++;
            }
        }

        // Declaración de arrays 
        int[] positivos = new int[posCount];
        int[] negativos = new int[negCount];

        int posIdx = 0;
        int negIdx = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] >= 0) {
                positivos[posIdx] = (int) numeros[i];
                posIdx++;
            } else {
                negativos[negIdx] = (int) numeros[i];  
                negIdx++;
            }
        }

        System.out.println("Negativos " + Arrays.toString(negativos));
        System.out.println("Positivos " + Arrays.toString(positivos));       

        int pares = 0;
        int nones = 0;

        for (int i = 0; i < positivos.length; i++) {
            if (positivos[i] % 2 == 0) {
                pares++;
            } else {
                nones++;
            }
        }

        int[] pareados = new int[pares];
        int[] nonados = new int[nones];

        int pos = 0;
        int neg = 0;

        for (int i = 0; i < positivos.length; i++) {
            if (positivos[i] % 2 == 0) {
                pareados[pos++] = positivos[i];
            } else {
                nonados[neg++] = positivos[i];
            }
        }

        System.out.println("Pares " + Arrays.toString(pareados));
        System.out.println("Impares " + Arrays.toString(nonados));
    }
}