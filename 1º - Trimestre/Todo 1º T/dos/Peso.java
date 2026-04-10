package dos;

public class Peso {

	private double pesoKg;

	public Peso(double peso, String unidad) {
		switch (unidad) {
		case "lb":
			pesoKg = peso * 0.453;
			break;
		case "li":
			pesoKg = peso * 14.59;
			break;
		case "oz":
			pesoKg = peso * 0.02835;
			break;
		case "p":
			pesoKg = peso * 0.00155;
			break;
		case "q":
			pesoKg = peso * 45.3;
			break;
		case "g":
			pesoKg = peso / 1000;
			break;
		default:
			break;
		}

	}

}
