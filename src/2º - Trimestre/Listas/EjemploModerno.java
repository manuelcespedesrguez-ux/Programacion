package Listas;

import java.util.ArrayList;
import java.util.List;

public class EjemploModerno {
    
    public static void main(String[] args) {
        
        // Usamos la Interfaz List a la izquierda (Principio de abstracción)
        List<String> listaSuper = new ArrayList<>();

        // Añadir elementos
        listaSuper.add("Leche");
        listaSuper.add("Huevos");
        listaSuper.add("Pan");
        listaSuper.add("Café");

        // Insertar y eliminar (igual que en Vector, pero más eficiente)
        listaSuper.add("Fruta");
        listaSuper.add("Verduras");

        // Recorrido moderno con Programación Funcional (Java 8+)
        System.out.println("--- Lista de la compra ---");
        listaSuper.forEach(item -> System.out.println("Producto: "+item));

        // Info
        System.out.println("\nTamaño: "+listaSuper.size());

    }

}
