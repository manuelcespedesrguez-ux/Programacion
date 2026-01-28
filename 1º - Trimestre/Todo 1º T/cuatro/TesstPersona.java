package cuatro;

public class TesstPersona {
	
	public static void main(String[] args) {
		
		Persona p1 = new Persona("Fran", "González Amador", "12345687Q", 1990);
		Persona p2 =new Persona("Paca", "Pacheco Garrido", "15487721W", 1968);
			
		System.out.println(p1);
		System.out.println(p2);
		
		p1.setPais("Andalucía");
		p2.setPais("Madrid");
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
		Persona p3 = new Persona("Margarita", "Robles Francisca", "19547862A", 1985, "Cataluña", 'F');
		
		System.out.println(p3);
	}
}
