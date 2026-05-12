package Peaje;

public abstract class Vehiculo {
    
    protected String placa;
    public int peajeAcumulado;

    Vehiculo(String placa) {
        this.placa = placa;
    }

}
