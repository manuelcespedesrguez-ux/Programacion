package Ejercicios;

import java.util.Arrays;
import java.util.Random;

public class Resuelto2 {
    
     public static int[] burbuja(int[] array) {

        int[] aux = array;
        for(int i=1;i<aux.length;i++){
            for(int j=0;j<aux.length-i;j++){
                if(aux[j]>aux[j+1]){
                    int swap = aux[j];
                    aux[j]=aux[j+1];
                    aux[j+1]=swap;
                }
            }
        }
        return aux;
    }

    // 2. Realiza un programa que cree un vector de 50 posisiciones con números entre 1 y el 100 ordenado método burbuja

    public static void main(String[] args) {

        // 1. Declaramos el array de 50 posiciones (capacidad fija)
		int[] numeros = new int [50];
        Random random = new Random();

        // 2. Llenamos el array con el bucle
        for(int i = 0; i < numeros.length; i++) {
            numeros[i] = 1 + random.nextInt(99);
        }
        System.out.println("Array desordenado");
        System.out.println(Arrays.toString(numeros));

        // Voy a ordenar en vez de por bubble por la patilla
        Arrays.sort(numeros);

        System.out.println("Array ordenado");
        System.out.println("Ordenado: "+Arrays.toString(burbuja(numeros)));
    }
  
}
