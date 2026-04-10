package Inmuebles;

public class Inmueble {
    
    // Atributos
    protected int id;
    protected int area;
    protected String direccion;
    protected double precioVenta = 0d;

    public int getId() {
        return id;
    }

    public void setIdentificadorInmueble(int id) {
        this.id = id;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    
    // Constructor
    public Inmueble(int id, int area, String direccion) {
        this.id = id;
        this.area = area;
        this.direccion = direccion;
    }

    protected double calcularPrecioVenta(double valorAreaUnitario) {
        return precioVenta = area * valorAreaUnitario;
    }

    @Override
    public String toString() {
        return "Inmueble: id del inmueble: " + id + ", area del inmueble: " + area + ", direccion del inmueble: "
                + direccion + ", precioVenta del inmueble: " + precioVenta + "]";
    }

}
