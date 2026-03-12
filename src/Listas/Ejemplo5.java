package Listas;

import java.util.ArrayList;

public class Ejemplo5 {
    
    public static void main(String[] args) {
        
        ArrayList<String> colores = new ArrayList<>();

        colores.add("rojo");
        colores.add("verde");
        colores.add("azul");
        colores.add("blanco");
        colores.add("amarillo");

        System.out.println("Contenido de la lista: ");
        System.out.println(colores);

        // Añado en el índice 1 el color turquesa
        colores.add(1, "turquesa");
        System.out.println("Contenido de la lista después de insertar en la posición 1: ");
        System.out.println(colores);


    }

}
