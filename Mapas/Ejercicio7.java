package Mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio7 {
    
    public static void main(String[] args) {

        // Creo mapa
        HashMap<Integer, String> mapa = new HashMap<Integer, String>();
        Scanner sc = new Scanner(System.in);

        // Inserto valores
        mapa.put(924, "Amalia Núñez");
        mapa.put(235, "Cindy Nero");
        mapa.put(456, "Víctor Tilla");
        mapa.put(123, "Esteban Quito");
        mapa.put(700, "Ana Conda");

       System.out.print("Por favor, introduzca un código:");
       int codigoIntroducido = Integer.parseInt(sc.nextLine());

       if (mapa.containsKey(codigoIntroducido)) {
        System.out.print("El código "+codigoIntroducido+" corresponde a : ");
        System.out.println(mapa.get(codigoIntroducido));
       } else {
        System.out.println("El código introducido no existe.");
       }

    }
}
