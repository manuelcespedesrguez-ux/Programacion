package Vehiculos;

public class Vehiculoterrestre extends Vehiculo implements Motor {
    
    private int numero_llantas;
    private String tipo_uso;

    public Vehiculoterrestre(int velocidad_actual, int velocidad_maxima, int numero_llantas, String tipo_uso) {
        super(velocidad_actual, velocidad_maxima);
        this.numero_llantas = numero_llantas;
        this.tipo_uso = tipo_uso;
    }

    @Override
    public void acelerar(int incrementar) {
        velocidad_actual = Math.min(velocidad_actual + incrementar, velocidad_maxima);
    }

    @Override
    public void frenar(int decrementar) {
        velocidad_actual = Math.max(velocidad_actual - decrementar, 0);
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("El vehiculo tiene " + numero_llantas + " llantas y es de tipo " + tipo_uso);
    }
    
}
