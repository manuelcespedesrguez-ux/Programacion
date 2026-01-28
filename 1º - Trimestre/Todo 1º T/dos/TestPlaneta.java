package dos;

import dos.Planeta.TipoPlaneta;

public class TestPlaneta {

	public static void main(String[] args) {

		Planeta tierra = new Planeta("Tierra", 1, 5.972e24, 1.08321e12, 12742, 150, TipoPlaneta.TERRESTRE, true);
		Planeta jupiter = new Planeta("Júpiter", 79, 1.89e27, 1.43128e15, 139822, 778, TipoPlaneta.GASEOSO, true);

		System.out.println(tierra);
		System.out.println("Densidad de la Tierra: " + tierra.densidad() + " kg/ km3");
		System.out.println("¿Tierra es planeta exterior?: " + tierra.esExterior());

		System.out.println(jupiter);
		System.out.println("Densidad de la Júpiter: " + jupiter.densidad() + " kg/ km3");

	}

}
