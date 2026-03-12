package  Repaso;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Ejercicio3 {
    
    
    // Genera un array de 50 posiciones flotantes que tomarán valores entre -100 y 100.
    // Separe en dos matrices los valores positivos y negativos. Ordene ambos arrays por el método Merge Sort
    // Considere el cero positivo. A continuación, separe el array de positivos en dos arrays, uno de pares y otro de impares

    public static void main(String[] args) {
        
        int tama = 50;
        float[] numeros =  new float[tama];
        float[] positivos = new float[tama];
        float[] negativos = new float[tama];
        Random rand = new Random();

        for (int i=0; i<numeros.length; i++) {
            numeros[i] = rand.nextFloat(-100, 100);
        }

        for (int i = 0; i<positivos.length; i++) {
            mergeSort(numeros, positivos, negativos);
        }

        // Ordeno por mergeSort
        Array.sort(array);
        System.out.println(Arrays.toString(array));
    
        for (int i = 0; i<positivos.length; i++) {
            if (positivos[i] >= 0) {
                positivos++;
            } else 
                negativos++;
        }

    }


}
