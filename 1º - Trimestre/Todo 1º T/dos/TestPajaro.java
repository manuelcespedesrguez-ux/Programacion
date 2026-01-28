package dos;

public class TestPajaro {
	
public static void main(String[] args) {
		
		Pajaro uno = new Pajaro ('N', 5, "Carlos");
		Pajaro dos = new Pajaro ('A', 7, "Martín");
		Pajaro tres = new Pajaro('V', 8, "Felipe");
		
		uno.mostrarInfo();
		System.out.println("El guacamayo " + uno.getNombre()+ " es tonto");
		uno.cantar();
		System.out.println("--------------");
		
		dos.mostrarInfo();
		System.out.println("El gorrión " + dos.getNombre()+ " es bonito");
		dos.cantar();
		System.out.println("--------------");
		
		tres.mostrarInfo();
		System.out.println("El gallo " + tres.getNombre()+ " es pesado");
		tres.cantar();
		System.out.println("--------------");
	}

}



