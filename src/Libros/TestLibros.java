package Libros;

import java.util.ArrayList;
import java.util.List;

public class TestLibros {
    
    public static void main(String[] args) {
        
        List<Libro> coleccion = new ArrayList<Libro>();
        // 1. Objeto de clase Libro (Genérico) 
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez");
        libro1.setPrecio(45000);

        // 2. Objeto de clase LibroTexto
        LibroTexto libro2 = new LibroTexto("Cálculo diferencial", "James Stewart", 1);
        libro2.setPrecio(85000);

        // 3. Objeto de la clase LibroTextoUNC
        LibroTextoUNC libro3 = new LibroTextoUNC("Fundamentos de Programación", "S. Arévalo", 2, "Facultad de Ingeniería");
        libro3.setPrecio(32000);

        // 4. Objeto de la clase Novela
        Novela libro4 = new Novela("El nombre de la rosa", "Umberto Eco", Novela.genero.histórica);
        libro4.setPrecio(52000);
    
        coleccion.add(libro1);
        coleccion.add(libro2);
        coleccion.add(libro3);  
        coleccion.add(libro4);
    
    }

}
