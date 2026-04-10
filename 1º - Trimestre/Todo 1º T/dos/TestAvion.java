package dos;

public class TestAvion {

	public static void main(String[] args) {

		Avion a1 = new Avion("Airbus", 4);
		Avion a2 = null;
		Avion a3 = new Avion("Boeing", 6);

		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);

		a2 = a1;
		System.out.println("Después de asignar a2 = a1");
		System.out.println(a1);
		System.out.println(a2);

		a1.setFabricante("Douglas");
		System.out.println("Cambio el fabricante de a1 con un setFabricante");
		System.out.println("¿Quien será ahora el fabricante de a2?");
		System.out.println(a1);
		System.out.println(a2);

		System.out.println("LLama a peluquitas que traiga otro avión");
		a1.cambiarFabricante(a3);

	}
}
