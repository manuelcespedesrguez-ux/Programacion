package Municipal;

import java.util.ArrayList;

public class Biblioteca {
    
    String nombre;
	/*
	 * Atributo que identifica la colección de libros de la biblioteca como un
	 * vector de libros
	 */
	ArrayList<Libro> coleccionLibros;

	Biblioteca(String nombre) {
		this.nombre = nombre;
		coleccionLibros = new ArrayList<Libro>(); // Crea el vector de libros
	}
	void anadirLibro(Libro libro) {
		coleccionLibros.add(libro); 
	}

	void listarLibros() {
		// Se recorre el vector de libros
		for (int i = 0; i < coleccionLibros.size(); i++) {
			Libro libro = (Libro) coleccionLibros.get(i);
			libro.imprimir();
		}
	}

}
