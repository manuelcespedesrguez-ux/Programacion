package dos;

import java.util.Arrays;

public class ArticuloCientifico {
	
	String nombre;
	String autor;
	String[] palabraClave = new String[3];
	String publicacion;
	int año;
	String resumen;
	
	ArticuloCientifico(String nombre, String autor) {
		this.autor = autor;
		this.nombre = nombre;		
	}
	
//	ArticuloCientifico(String publicacion, String resumen){
//		
//		this.publicacion = publicacion;
//		this.resumen = resumen;	
//	}
	
	ArticuloCientifico(String nombre, String autor, String[] palabrasClave, String publicacion, int año){
		
//		this.titulo;
//		this.autor;
		
		this(nombre,autor);
		
		this.palabraClave = palabrasClave;
		this.publicacion = publicacion;
		this.año = año;
	}
	
	ArticuloCientifico(String nombre, String autor, String[] palabrasClave, String publicacion, int año, String resumen){
		this(nombre, autor, palabrasClave, publicacion, año);
		this.resumen = resumen;
	}

	@Override
	public String toString() {
		return "ArticuloCientifico [nombre=" + nombre + ", autor=" + autor + ", palabraClave="
				+ Arrays.toString(palabraClave) + ", publicacion=" + publicacion + ", año=" + año + ", resumen="
				+ resumen + "]";
	}
	
	

}
