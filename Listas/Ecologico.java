package Listas;

import java.util.HashMap;
import java.util.Random;

public class Ecologico implements Comparable<Ecologico> {

    /*
     * Un supermercado de productos ecológicos nos ha pedido hacer un programa
     * para vender su mercancía. En esta primera versión del programa se tendrán
     * en cuenta los productos que se indican en la tabla junto con su precio. Los
     * productos se venden en bote, brick, etc. Cuando se realiza la compra, hay que
     * indicar el producto y el número de unidades que se compran, por ejemplo
     * “guisantes” si se quiere comprar un bote de guisantes y la cantidad, por
     * ejemplo “3” si se quieren comprar 3 botes. La compra se termina con la
     * palabra
     * “fin. Suponemos que el usuario no va a intentar comprar un producto que
     * no existe. Utiliza un diccionario para almacenar los nombres y precios de los
     * productos y una o varias listas para almacenar la compra que realiza el
     * usuario.
     */

    public static HashMap<String, Float> contar = new HashMap<String, Float>();

    public static void cargarProductos() {
        contar.put("avena", 2.21f);
        contar.put("garbanzos", 2.39f);
        contar.put("tomate", 1.59f);
        contar.put("jengibre", 3.130f);
        contar.put("quinoa", 4.50f);
        contar.put("guisantes", 1.60f);
    }

    static String[] productos = { "avena", "garbanzos", "tomate", "jengibre", "quinoa", "guisantes" };

    String producto;
    int cantidad;

    Ecologico() {
        Random r = new Random();
        this.producto = productos[r.nextInt(6)];
    }

    Ecologico(String producto) {
        this.producto = producto;
    }

    Ecologico(String producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((producto == null) ? 0 : producto.hashCode());
        result = prime * result + cantidad;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Ecologico other = (Ecologico) obj;
        if (producto == null) {
            if (other.producto != null)
                return false;
        } else if (!producto.equals(other.producto))
            return false;
        if (cantidad != other.cantidad)
            return false;
        return true;
    }

    @Override
    public int compareTo(Ecologico o) {
        return this.getProducto().compareTo(o.getProducto());
    }

}
