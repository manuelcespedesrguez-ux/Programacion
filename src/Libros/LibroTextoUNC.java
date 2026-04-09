package Libros;

public class LibroTextoUNC extends LibroTexto {
    
    // Nuevo atributo
    protected String facultad;
    
    public LibroTextoUNC(String titulo, String autor, int curso, String facultad) {
        super(titulo, autor, curso);
        this.facultad = facultad;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    @Override
    public String toString() {
        String papito = super.toString();
        return "El libro de texto de la UNC " + papito + " y pertenece a la facultad de: " + facultad;
    }

    


}
