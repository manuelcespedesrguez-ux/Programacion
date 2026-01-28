package dos;

public class testSatelite {

	public static void main(String[] args) {

		Satelite xabarin = new Satelite(-7.92,42.1,5.0);
		xabarin.printPosicion();
		
		Satelite mir = new Satelite();
		mir.setPosicion(44.5, 53.7, 300);
		mir.printPosicion();
		
		
	}

}
