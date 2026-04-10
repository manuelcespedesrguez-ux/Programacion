package Listas;

import java.util.ArrayList;

public class Ejemplo2 {
    
    public static void main(String[] args) {

    ArrayList<String> colores = new ArrayList<>();

    colores.add("rojo");
    colores.add("verde");
    colores.add("azul");

    System.out.println("Contenido de la lista: ");
    for(int i = 0; i < colores.size(); i++){
        System.out.println(colores.get(i));
    }

    System.out.println("Contenido de la lista again: ");
    for(String lin : colores){
        System.out.println(lin);
    }
    
    }
}
