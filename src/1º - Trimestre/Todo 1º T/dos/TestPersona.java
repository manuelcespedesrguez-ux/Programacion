package dos;

public class TestPersona {

	public static void main(String[] args) {
		
		Persona uno = new Persona();
		System.out.println(uno.toString());
		uno.setNombre(" Wilfredo");
		System.out.println(uno.toString());
		uno.setApellido(" Pino");
		uno.setEdad(30);
		System.out.println(uno.toString());
		
		uno.canto();
	    System.out.println(      uno.tengoSueño(7));	
	    uno.firmaPapelFolga("Willi");
	    
	    Persona dos = new Persona(" Javi", "Denis", 19);
	    System.out.println(dos.toString());
	    
	    System.out.println( dos.getApellido());
		
		
	}
}