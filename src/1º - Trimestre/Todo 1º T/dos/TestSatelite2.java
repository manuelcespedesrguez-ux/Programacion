package dos;

public class TestSatelite2 {

	public static void main(String[] args) {
		
		Automovil pakito = new Automovil("c15", "blanco", 140);
		
		Satelite xabarin = new Satelite(-7.92,42.1,5.0);
		System.out.println(xabarin.toString());
		
		Satelite mir = new Satelite();
		mir.setPosicion(44.5, 53.7, 300);
		System.out.println(mir.toString());
		
		System.out.println(xabarin.enOrbita());
		System.out.println(mir.enOrbita());
		
		xabarin.variaPosicion(100, 200);
		System.out.println(xabarin.toString());
		
		mir.variaALtura(-20);
		System.out.println(mir.toString());
		
	}

}
