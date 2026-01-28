package dos;

import dos.Pelicula.TipoPelicula;

public class TestPelicula {
	
	public static void main(String[] args) {
		
		Pelicula Pelicula1 = new Pelicula("Gandhi", "Richard  Attenborough", TipoPelicula.DRAMA, 191, 1982, 8.1);
		Pelicula Pelicula2 = new Pelicula("Thor", "Kenneth Branagh", TipoPelicula.ACCIÓN, 115, 2011, 7.0);
		
		System.out.println(Pelicula1);
		System.out.println(Pelicula2);
		
		System.out.println("La película es épica? ");
		System.out.println(Pelicula1.esPeliculaEpica());
		System.out.println(Pelicula2.esPeliculaEpica());
		
		System.out.println("La calificación de la pelicula es: ");
		System.out.println(Pelicula1.calcularValoracion());
		System.out.println(Pelicula2.calcularValoracion());
		
		System.out.println("Las película son similares? ");
		System.out.println(Pelicula1.esSimilar(Pelicula2));
		System.out.println(Pelicula2.esSimilar(Pelicula1));
	
	}
}
