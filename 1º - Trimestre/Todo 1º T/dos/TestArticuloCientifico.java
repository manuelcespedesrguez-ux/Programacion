package dos;

public class TestArticuloCientifico {

	public static void main(String[] args) {
		String[] palabras = {"Física", "Espacio", "Tiempo"};
		
		for(int i=0; i<palabras.length; i++)
			System.out.println(palabras[ i ]);
		
		ArticuloCientifico articulo = new ArticuloCientifico("La teoría especial de la relatividad", "Albert Einstein", palabras, "Anales de la Física", 1913, 
				"Las leyes de la física son las mismas en todos los sistemas de referencia inerciales.");
		
		System.out.println(articulo);
	}
}
