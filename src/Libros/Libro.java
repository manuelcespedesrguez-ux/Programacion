package Libros;

public class Libro {

    // Atributos
    protected String titulo;
    protected String autor;
    protected double precio = 0d;

    // Añadimos este atributo buleano, valor por defecto falso
    protected boolean prestado = false;

    // Como es boolean, se usa IS no GET
    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    // Constructor
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "El libro " + titulo + " fue escrito por el autor " + autor + " y tiene un precio de $" + precio;
    }

    // Métodos propios

    // Prestar
    public void prestar() {
        if (!prestado) {
            System.out.println("Acabas de prestar el libro " + titulo);
            prestado = true;
        } else {
            System.out.println("El libro " + titulo + " ya está prestado");
        }
    }

    // Devolver
    public void devolver() {
        if (prestado) {
            System.out.println("Acabas de devolver el libro " + titulo);
            prestado = false;
        } else {
            System.out.println("El libro " + titulo + " no está prestado");
        }
    }

}
