package Mascotas;

public class PeloCorto extends Gato {
    
    protected double porcentaje_pelo_corto = 0.10;

    enum razaPC {
        azul_ruso, britanico, siamés, scottish_fold, devon_rex, manx 
    }

    private razaPC raza;

    public PeloCorto(String nombre, int edad, String color, double altura, double longitud, razaPC raza) {
        super(nombre, edad, color, altura, longitud);
        this.raza = raza;
    }

    public razaPC getRaza() {
        return raza;
    }

    public void setRaza(razaPC raza) {
        this.raza = raza;
    }

    @Override
    public double calcularPrecio() {
        double precioActual = super.calcularPrecio();
        return precioActual + (precioActual * porcentaje_pelo_corto);
    }

    @Override
    public String toString() {
        return "El gato de pelo corto que se llama " + nombre + ", tiene una altura de " + altura + " m, tiene " + edad + " años, y una longitud de " + longitud + 
        " m y es de color " + color + " y de raza " + raza;
    }
    

}
