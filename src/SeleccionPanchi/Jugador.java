package SeleccionPanchi;

public class Jugador extends Personas {
    
    protected boolean esTitular;

    public Jugador(String nombre, String apellido, int edad, boolean esTitular) {
        super(nombre, apellido, edad);
        this.esTitular = esTitular;
    }

    public boolean isTitular() {
        return esTitular;
    }

    public void setTitular(boolean esTitular) {
        this.esTitular = esTitular;
    }

    void imprimir() {
        super.imprimir();
        System.out.println("El jugador es titular: " + esTitular);
    }

}
