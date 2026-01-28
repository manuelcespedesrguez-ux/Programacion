package dos;

public class TestPedido {
	
	public static void main(String[] args) {
		
		Pedido Bar_Paco = new Pedido();
		
		Bar_Paco.calcularPrecio("Sopa Castellana", 5, "Agua", 1.10);
		Bar_Paco.calcularPedido("Croquetas", 6, "Entrecot con patatas fritas", 15, "Coca-Cola Zero", 2.30);
		Bar_Paco.calcularPrecio("Caviar de ballena", 18, "Solomillo al roquefort", 17, "Cheesecake", 7, "Estrella Galicia", 2.50);
	
}
}
