package Listas;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        
        List<String> compis = new ArrayList<>();
        compis.add("Anxo F");
        compis.add("Jorge F");
        compis.add("Anxo Fonterosa");
        compis.add("Sergio E");
        compis.add("Manuel C");

        for (String puntero : compis)
            System.out.println(puntero);
    }

}
