package Listas;

import java.util.ArrayList;
import java.util.Collections;

public class EjemploGato {
    
    public static void main(String[] args) {

    ArrayList<Gato> gateria = new ArrayList<Gato>();

    gateria.add(new Gato("Garfield", "naranja", "mestizo"));
    gateria.add(new Gato("Pepe", "gris", "angora"));
    gateria.add(new Gato("Mauri", "blanco", "manx"));
    gateria.add(new Gato("Ulises", "beige", "persa"));
    gateria.add(new Gato("Adán", "negro", "angora"));
    gateria.add(new Gato("Tom", "gris", "británico"));
    gateria.add(new Gato("Charlie", "marron", "mestizo"));
    gateria.add(new Gato("Leo", "amarillo", "mestizo"));

    // Ordena a su bola
    Collections.sort(gateria);
    System.out.println("\nDatos de los gatos ordenados por nombre: ");
    for (Gato gatoAux : gateria){
        System.out.println(gatoAux + "\n");
    }


    }
}
