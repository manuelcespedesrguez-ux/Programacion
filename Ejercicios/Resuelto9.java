package Ejercicios;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Resuelto9 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // 1. Declaramos el array de 50 posiciones (capacidad fija)
        int[] numero = new int[50];
        Random random = new Random();

        // 2. Llenamos el array con el bucle
        for(int i=0; i<numero.length; i++){
            numero[i] = 1+random.nextInt(99);
        }

        System.out.println("Array desordenado");
        System.out.println(Arrays.toString(numero));

        Arrays.sort(numero);
        System.out.println("Array ordenado");
        System.out.println(Arrays.toString(numero));
        
        System.out.println("Tras ordenar dame el número a buscar: ");
        int num = Integer.parseInt(sc.nextLine());

        // Método busqueda binaria??
        int indice = Arrays.binarySearch(numero, num);
        if(indice >= 0)
            System.out.println("Encontrado el valor "+num+" en el índice "+indice);
        else 
            System.out.println("No he encontrado el valor "+num+" y se insetaría en la posición (sin signo) "+indice);
    }
}
