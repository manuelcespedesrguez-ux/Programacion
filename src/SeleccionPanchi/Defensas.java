package SeleccionPanchi;

public class Defensas extends Jugador {
    
    private int balonescortados;
    private int numeroamarillas;
    
    public Defensas(String nombre, String apellido, int edad, boolean esTitular, int balonescortados,
            int numeroamarillas) {
        super(nombre, apellido, edad, esTitular);
        this.balonescortados = balonescortados;
        this.numeroamarillas = numeroamarillas;
    }

    public int getBalonescortados() {
        return balonescortados;
    }

    public void setBalonescortados(int balonescortados) {
        this.balonescortados = balonescortados;
    }

    public int getNumeroamarillas() {
        return numeroamarillas;
    }

    public void setNumeroamarillas(int numeroamarillas) {
        this.numeroamarillas = numeroamarillas;
    }

    void imprimir() {
        super.imprimir();
        System.out.println("El defensa cortó " + balonescortados + " jugadas y obtuvo " + numeroamarillas + " tarjetas amarillas.\n");
    }


}
