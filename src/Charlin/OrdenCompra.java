package Charlin;

import java.util.Arrays;

public class OrdenCompra {
    
    int id;
    String[] lineapedido;

    public OrdenCompra(int id, String[] lineapedido) {
        this.id = id;
        this.lineapedido = lineapedido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void calcularTotal(){

    }

    @Override
    public String toString() {
        return "El orden de compra con id " + id + " y linea de pedido " + Arrays.toString(lineapedido);
    }

    

}
