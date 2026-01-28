package dos;

public class Meses1 {
	
	public enum Color {
		ROJO,VERDE,AZUL
	}
	
	public enum DiaSemana {
		LUNES,MARTES,MIÉRCOLES,JUEVES,VIERNES,SÁBADO,DOMINGO
	}
	
	public static void main(String[] args) {
		DiaSemana miFiesta;
		miFiesta = DiaSemana.LUNES;
		
		switch (miFiesta) {
		case LUNES:
		    System.out.println("Empezar la semana...");
		    break;
		case VIERNES:
			System.out.println("¡Por fin es viernes!");
			break;
		case SÁBADO:
		case DOMINGO:
			System.out.println("Fin de semana");
			break;
		default: 
			System.out.println("Otro día más...");
		}
		
		Meses miCumple;
		
		miCumple=Meses.JUNIO;
		
		for (Meses meses : Meses.values()) {
			System.out.println("Mes: "+meses);
		}
		
	}

}
