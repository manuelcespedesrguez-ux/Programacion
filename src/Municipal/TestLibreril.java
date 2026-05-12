package Municipal;

public class TestLibreril {
    
    public static void main(String[] args) {
        

        Libro libro1 = new Libro("El Quijote", "Anónimo", 1605, "Cátedra", "456215");
        Libro libro2 = new Libro("El origen de las especies", "Charles Darwin", 1859, "Bergua", "786541");
        Libro libro3 = new Libro("La colmena", "Camilo Jose Cela", 1946, "Émece", "689421");

        Biblioteca charca = new Biblioteca("Biblioteca Municipal de Vigo");
        charca.anadirLibro(libro1);
        charca.anadirLibro(libro2);
        charca.anadirLibro(libro3);

        charca.listarLibros();       

    }

}
