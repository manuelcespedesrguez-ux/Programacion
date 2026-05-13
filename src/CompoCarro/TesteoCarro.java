package CompoCarro;

public class TesteoCarro {
    
    public static void main(String[] args) {
        
        Carro carrito = new Carro(2, tipoChasis.MONOCASCO, "rojo", tipoCarroceria.TUBULAR, "Goodyear", 25, 20, 15);
        carrito.imprimir();

    }

}
