package dos;

import java.util.Scanner;

public class TestLukas {

	public static void main(String[] args) {
		
		Propuesto12 p12 = new Propuesto12(0.1,0.1);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Buenos días,");
		System.out.println("Hay que ver las existencias en el almacén...");
		p12.existenciaAlmacen();
		
		System.out.println("Compra patatas: ");
		p12.addPatatas(Double.parseDouble(sc.nextLine()));
		System.out.println("Comprar chocos: ");
		p12.addchocos(Double.parseDouble(sc.nextLine()));
		
		//*System.out.println("Preparamos la comida para "+p12.numClientes());
		
		System.out.println("Fregando platos...");
		
		p12.existenciaAlmacen();
		
		System.out.println("Venga hasta mañana.");
		
		sc.close();
	}
}
