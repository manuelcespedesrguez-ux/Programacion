package Peaje;

public class Carro extends Vehiculo {
    
    static int valorPeaje = 100;

    public static int getValorPeaje() {
        return valorPeaje;
    }

    public static void setValorPeaje(int valorPeaje) {
        Carro.valorPeaje = valorPeaje;
    }

    Carro(String placa) {
        super(placa);
    }

    void imprimir() {
        System.out.println("El coche con matrícula " + placa + " ha pagado un peaje de " + valorPeaje + " euros.");
    }

}
