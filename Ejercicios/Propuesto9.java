package Ejercicios;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Propuesto9 {

    public static void main(String[] args) {

        Random random = new Random();
        int[] aleatorios = new int[100];

        for (int i = 0; i < aleatorios.length; i++) {
            aleatorios[i] = 10 + random.nextInt(70);
        }
        System.out.println(aleatorios);

        // Ordeno
        // Arrays.sort(aleatorios);
        // System.out.println(Arrays.toString(aleatorios));
        int max = aleatorios[0], min = aleatorios[0];
        int total = 0;

        for (Integer i : aleatorios) {
            if (i > max)
                max = i;
            if (i < min)
                min = i;
            total += i;
        }
        System.out.println("El máximo es: " + max);
        System.out.println("El mínimo es: " + min);
        System.out.println("la media es: " + (double) total / aleatorios.length);

        Map<Integer, Integer> cuenta = new HashMap<Integer, Integer>();

        for (int i = 10; i < 81; i++) {
            cuenta.put(i, 0);
        }

        // Ver entero
        for (Map.Entry<Integer, Integer> pareja : cuenta.entrySet()) {
            System.out.println(pareja);
        }

        // Contar
        for (Integer i : aleatorios) {
            int valor = cuenta.get(i);
            cuenta.put(i, valor + 1);
        }

        for (Map.Entry<Integer, Integer> pareja : cuenta.entrySet()) {
            System.out.println(pareja.getKey() + "-->");
            System.out.println(pareja.getValue());
        }

        // Buscar la moda
        int moda = aleatorios[0];
        int repe = 0;
        for (Map.Entry<Integer, Integer> pareja : cuenta.entrySet()) {
            if (pareja.getValue() > repe) {
                repe = pareja.getValue();
                repe = pareja.getKey();
            }
        }

        System.out.println("La moda es: " + moda + " que se repite: " + repe + " veces");
    }
}
