package Ejercicios;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Resuelto9Bins {

    // Método de búsqueda binaria recursivo
    public static int buscabin(int[] a, int valor, int min, int max) {
        if (min == max) {
            System.out.println("Salida porque min = max");
            return -1;
        }

        // Parte reursiva en dos trozos y ...
        int mitad = (min + max) / 2;
        System.out.println("min" +min+" a[min] "+a[min]+" max "+max+" a[max] "+a[max]+" mitad "+mitad+" a[mitad] "+a[mitad]);

        // Posibles resultados
        if (valor == a[mitad]) return mitad;
        if (valor == a[min]) return min;
        if (valor == a[max]) return max;

        if (valor > a[mitad])
            return buscabin(a, valor, mitad+1, max);
        else 
            return buscabin(a, valor, min, mitad-1);
    }

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

        // Método de ordenamiento el que queramos pero es obligatorio ordenar para realizar una búsqueda binaria
        Arrays.sort(numero);
        System.out.println("Array ordenado");
        System.out.println(Arrays.toString(numero));
        
        System.out.println("Tras ordenar dame el número a buscar: ");
        int num = Integer.parseInt(sc.nextLine());

        // Método búsqueda binaria
        int indice = buscabin(numero, num, 0, numero.length-1);
        if(indice >= 0)
            System.out.println("Encontrado el valor "+num+" en el índice "+indice);
        else 
            System.out.println("No he encontrado el valor "+num+" y se insetaría en la posición (sin signo) "+indice);
    }
}


