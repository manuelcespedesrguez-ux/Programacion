package Mapas;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        // Creo mapa
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> m = new HashMap<Integer, String>();

        // Inserto valores
        m.put(924, "Amalia Núñez");
        m.put(235, "Cindy Nero");
        m.put(456, "Víctor Tilla");
        m.put(123, "Esteban Quito");
        m.put(700, "Ana Conda");

        // Muestra el valor que corresponder a diferentes claves (si lo hay)
        System.out.println(m.get(924));
        System.out.println(m.get(237));
        System.out.println(m.get(456));
        System.out.println(m.get(125));
        System.out.println(m.get(700));

        int i = 0;
        while (i < 5) {
            System.out.println("Clave a introducir: ");
            int clave = Integer.parseInt(sc.nextLine());
            if (m.containsKey(clave))
                System.out.println("Corresponde a: " + m.get(clave));
            else
                System.out.println("Nadie con esa clave");
            i++;
        }
    }
}
