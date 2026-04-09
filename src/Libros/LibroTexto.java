package Libros;

public class LibroTexto extends Libro{
    
    protected int curso;

    // Constructor
    public LibroTexto(String t, String a, int c) {
        super(t, a);
        this.curso = c;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        String papa = super.toString();
        return "El libro de texto " + papa + " y pertenece al curso: " + curso;
    }

}
