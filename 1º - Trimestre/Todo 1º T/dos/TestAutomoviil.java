package dos;

import dos.Automoviil.combustibleTipo;
import dos.Automoviil.autoTipo;
import dos.Automoviil.color;

public class TestAutomoviil {
	
	public static void main(String[] args) {
	
		Automoviil Chiquito_de_la_calzada = new Automoviil("Seat", 124, 1.8, 5, 5, 220, 110,
				combustibleTipo.GASOLINA, autoTipo.FAMILIAR, color.BLANCO, false);
		
		System.out.println(Chiquito_de_la_calzada);
		
		Chiquito_de_la_calzada.acelerar(20);
		Chiquito_de_la_calzada.desacelerar(50);
		Chiquito_de_la_calzada.frenar();	
		
		System.out.println("¿Es automático?: "+Chiquito_de_la_calzada.automatico);
		
		System.out.println("---------------------");
	
		Automoviil sport = Chiquito_de_la_calzada.duplicaMicoche();
		System.out.println(sport.toString());
		
		System.out.println(Chiquito_de_la_calzada.equals(sport));
	}
}