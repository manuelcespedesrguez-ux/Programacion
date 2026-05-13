package CompoCarro;

public class Carro {
    
    Motor motor; 
	Chasis chasis; 
	Llanta[] llantas;
	Carroceria carroceria;
	
	public Carro(int volumen, tipoChasis claseChasis, String color, 
			tipoCarroceria claseCarroceria, String marca, int diametro, int altura, int anchura) {
	
		motor = new Motor(volumen); // Crea el motor de un automóvil
		chasis = new Chasis(claseChasis); // Crea el chasis de un automóvil
		llantas = new Llanta[4]; // Crea un array de 4 llantas
			for (int i = 0; i < llantas.length; i++) {
				// Crea cada una de las cuatro llantas de un automóvil
				llantas[i] = new Llanta(marca,diametro,altura,anchura);
			}
			carroceria = new Carroceria(color,claseCarroceria);
	}
	
	void imprimir() {
	System.out.println("Datos del Carro:");
    System.out.println("El carro tiene un motor de " + motor.volumen + ", un chasis " + chasis.tipo + ", su carrocería es " + carroceria.tipo 
                        + " y tiene " + llantas.length + " llantas.");
	for (int i = 0; i < llantas.length; i++)
		llantas[i].imprimir(); // Imprime los datos de cada llanta
	}

}