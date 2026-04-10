package Listas;

import java.util.ArrayList;

public class Ejemplo3 {
    
    public static void main(String[] args) {
        
        ArrayList<String> colores = new ArrayList<>();

        colores.add("rojo");
        colores.add("morado");
        colores.add("naranja");
        colores.add("amarillo");
        colores.add("verde");
        colores.add("rosa");
        colores.add("azul");
        colores.add("blanco");
        colores.add("gris");
        colores.add("negro");

        System.out.println("Contenido de la lista: ");
        for (String color : colores){
            System.out.println(color);
        }

        if (colores.contains("blanco")) {
            System.out.println("El "+colores+" está en la lista de colores");
        }

        colores.remove("blanco");

        System.out.println("Contenido de la lista después de quitar la "+" primera ocurrencia del color blanco:");

        for (String color : colores){
            System.out.println(color);
        }

        colores.remove(2);

        System.out.println("Contenido de la lista después de quitar el "+" elemento de la posición 2: ");

        for (String color : colores) {
            System.out.println(color);
        }
    }

}
