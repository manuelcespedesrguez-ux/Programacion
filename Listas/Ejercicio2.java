package Listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        Random mero = new Random();

        int elementos = 10+mero.nextInt(11);
        System.out.println("El número de elementos de la lista es: "+elementos);
        
        List<Integer> numeros = new ArrayList<>();

        for(int i=0; i<elementos; i++);
            numeros.add(mero.nextInt(100));

        System.out.println(numeros);

        int pequeño = Collections.min(numeros);
        int grande = Collections.max(numeros);

        System.out.println("El pequeño es: "+pequeño);
        System.out.println("El mayor es: "+grande);

        int suma = 0;
        for(int i = 0; i<elementos; i++)
            suma+= numeros.get(i);

        System.out.println("La suma es: "+suma);
        System.out.println("El promedio es: "+suma/(double)elementos);

        //int adicion = 0;
        // Idem con otra forma de calcular 
        //numeros.forEach(item -> {adicion+item});

        int[] acumulador = {0};

        // Truco para poder modificar la variable dentro de lambda

        numeros.forEach(n -> acumulador[0] += n);

        int añade = acumulador[0];
        double promedio = (double) añade / numeros.size();

        System.out.println("La suma es: "+suma);
        System.out.println("El promedio es: "+promedio);

        System.out.println("Con streams ver para 2º DAM");

        // Suma usando un Stream
        int adition = numeros.stream()
                             .mapToInt(Integer::intValue)
                             .sum();
        System.out.println("La suma es: "+adition);
        System.out.println("El promedio es: "+promedio);
    }

}
