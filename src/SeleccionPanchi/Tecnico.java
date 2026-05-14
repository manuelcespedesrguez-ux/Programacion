package SeleccionPanchi;

public class Tecnico extends Personas {
    
    protected int anhosexperiencia;
    protected boolean esNacional;

    public Tecnico(String nombre, String apellido, int edad, int anhosexperiencia, boolean esNacional) {
        super(nombre, apellido, edad);
        this.anhosexperiencia = anhosexperiencia;
        this.esNacional = esNacional;
    }

    public int getAnhosexperiencia() {
        return anhosexperiencia;
    }

    public void setAnhosexperiencia(int anhosexperiencia) {
        this.anhosexperiencia = anhosexperiencia;
    }

    public boolean isNacional() {
        return esNacional;
    }

    public void setNacional(boolean esNacional) {
        this.esNacional = esNacional;
    }

    void imprimir() {
        super.imprimir();
        System.out.println("El técnico tiene " + anhosexperiencia + " años de experiencia");
        System.out.println("El técnico es nacional: " + esNacional + "\n");
    }    

}
