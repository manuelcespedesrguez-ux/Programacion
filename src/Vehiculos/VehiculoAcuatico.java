package Vehiculos;

public class VehiculoAcuatico extends Vehiculo implements Motor, Vela{
    
    private String tipo_terreno;
    private int capacidad_pasajeros;

    public VehiculoAcuatico(int velocidad_actual, int velocidad_maxima, String tipo_terreno, int capacidad_pasajeros) {
        super(velocidad_actual, velocidad_maxima);
        this.tipo_terreno = tipo_terreno;
        this.capacidad_pasajeros = capacidad_pasajeros;
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
    public void recomendarVelocidad(int velocidadViento) {
        if (velocidadViento > 80 || velocidadViento < 10) {
            System.out.println("El viento no es apto para salir a navegar");
            this.velocidad_actual = 0;
        } else {
            System.out.println("El viento es adecuado para salir a navegar, aunque se recomienda precaución");
        }
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("El vehículo es de tipo " + tipo_terreno + " y tiene una capacidad de " + capacidad_pasajeros + " pasajeros.");
    }
}
