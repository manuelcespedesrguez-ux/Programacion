package dos;

public class TestAutomovil {

	public static void main(String[] args) {

		Automovil auto1 = new Automovil("Toyota", "Rojo", 50);
		Automovil auto2 = new Automovil("Ford", "Azul", 30);

		auto1.acelerarConCariño(20);
		auto2.acelerarConCariño(40);

		auto1.claxonCariñoso();
		auto2.claxonCariñoso();

		System.out.println(auto1.toString());
		System.out.println(auto2.toString());

		System.out.println(auto1.equals(auto2));

	}

}
