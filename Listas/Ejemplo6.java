package Listas;

import java.util.ArrayList;

public class Ejemplo6 {
    
    public static void main(String[] args) {
        
        ArrayList<String> colores = new ArrayList<>();

        colores.add("rojo");
        colores.add("verde");
        colores.add("azul");
        colores.add("blanco");
        colores.add("amarillo");

        System.out.println("Contenido de la lista: ");
        System.out.println(colores);

        // removeIf
        colores.removeIf(palabra -> palabra.startsWith("a"));
        System.out.println("Contenido de la lista después de borrar las "+" palabras que empiezan con la letra \"a\": ");
        System.out.println(colores);


    }

}
