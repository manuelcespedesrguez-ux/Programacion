package Ejercicios;

import java.util.Arrays;
import java.util.Random;

public class Propuesto7 {

    public static int[] insertionsort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int copyNumber = numbers[i];
            int j = i;
            while (j > 0 && copyNumber < numbers[j - 1]) {
                numbers[j] = numbers[j - 1];
                j--;
            }

            numbers[j] = copyNumber;
        }
        return numbers;
    }

    public static int[] juntaArrays(int[] array1, int[] array2) {

        // genera array que va a devolver
        int n = (array1.length + array2.length);
        int[] nuevo = new int[n];

        // llena array con lo del primero
        for (int i = 0; i < array1.length; i++) {
            nuevo[i] = array1[i];
        }

        // continua llenando con lo del segundo
        for (int i = array1.length; i < nuevo.length; i++) {
            nuevo[i] = array2[i - array1.length];
        }

        return nuevo;
    }

    public static void main(String[] args) {

        int[] uno = new int[70];
        int[] otro = new int[60];
        Random random = new Random();

        for (int i = 0; i < uno.length; i++) {
            uno[i] = (random.nextInt(200) + 1);
        }

        for (int i = 0; i < otro.length; i++) {
            otro[i] = (random.nextInt(200) + 1);
        }

        System.out.println(Arrays.toString(uno));
        System.out.println(Arrays.toString(otro));

        // imprime por pantalla el array juntado y ordenado
        System.out.println(Arrays.toString(insertionsort(juntaArrays(uno, otro))));
    }
}