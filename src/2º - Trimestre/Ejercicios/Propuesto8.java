package Ejercicios;

import java.util.Arrays;
import java.util.Random;

public class Propuesto8 {
    
    public static void main(String[] args) {
        
        Random random = new Random();
        int[] aleatorios = new int [1000];

        for(int i = 0; i < aleatorios.length; i++){
            aleatorios[i] = random.nextInt(500);
        }

        System.out.println(Arrays.toString(aleatorios));

        // Opción 1
        Arrays.sort(aleatorios);

        // Genero una matriz con los 10 más altos
        int [] altos = new int [10];

        altos = Arrays.copyOfRange(aleatorios, 990, 1000);
        System.out.println("Los 10 más altos son...");
        System.out.println(Arrays.toString(altos));
    }
}
