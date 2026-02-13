package Listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EjemploColeccionesGatos {
    
    public static void main(String[] args) {
        
    // Crea una lista de gatos
    List<Gato> gateria = new ArrayList<>();

    gateria.add(new Gato("Zarpas", "Naranja", "Tabby"));
    gateria.add(new Gato("Charlie", "Marrón oscuro", "Mestizo"));
    gateria.add(new Gato("Leo", "Naranja", "Mestizo"));
    gateria.add(new Gato("Isidoro", "Negro", "Callejero"));
    gateria.add(new Gato("Kirk", "Gris", "Persa"));
    
    System.out.println("--- Lista Inicial ---\n "+gateria);

    // SORT (compareTo)
    Collections.sort(gateria);
    System.out.println("--- Ordenados (A-Z) ---\n "+gateria);

    // REVERSE
    Collections.reverse(gateria);
    System.out.println("--- Ordenados (Z-A) ---\n "+gateria);

    // SHUFFLE
    Collections.shuffle(gateria);
    System.out.println("Orden aleatorio\n"+gateria);

    // MIN y MAX: Basado en el nombre alfabéticamente
    Gato primero = Collections.min(gateria);
    Gato ultimo = Collections.max(gateria);
    System.out.println("El primero alfabéticamente es "+primero.getNombre());
    System.out.println("El último alfabéticamente es "+ultimo.getNombre());

    // FREQUENCY (usa el método equals que definimos por nombre)
    int numIsidoros = Collections.frequency(gateria, new Gato("Isidoro", "", ""));
    System.out.println("\nNúmero de Isidoros: "+numIsidoros);

    // REPLACEALL Cambiamos 'Isidoro' por 'Michi supremo'
    Collections.replaceAll(gateria,
        new Gato("Isidoro","", ""),
        new Gato("Michi Supremo", "Dorado", "Dios")
    );
    System.out.println("\n--- Tras el replaceAll ---\n "+gateria);

    // BINARYSEARCH, buscar la posición de 'Abelardo'
    // ¡OJO! Hay que ordenar antes de buscar
    Collections.sort(gateria);
    int pos = Collections.binarySearch(gateria, new Gato("Abelardo", "", ""));
    System.out.println("Abelardo está en la posición: "+pos);

    // UNMODIFIABLELIST 
    List<Gato> listaBlindada = Collections.unmodifiableList(gateria);
    // listaBlindada.add = (new Gato("Nuevo", "Blanco", "Común")); // Esto daría ERROR    
    }
}
