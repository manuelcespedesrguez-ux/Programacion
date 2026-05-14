package SeleccionPanchi;

public abstract class Personas {
    
    protected String nombre;
    protected String apellido;
    protected int edad;

    public Personas(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }    

    void imprimir() {
        System.out.println(nombre + " " + apellido + ", tiene " + edad + " años");
    }

}
