package dos;

import java.util.Scanner;

public class TestMinumero {

	public static void main(String[] args) {

		boolean loop = true;
		Scanner sc = new Scanner(System.in);
		Minumero objeto = new Minumero();

		do {
			System.out.println("(1) Sumar\n(2) Restar\n(3) Duplicar\n(4) Triplicar\n"
					+ "(5) Ver número\n(6) Resetear el valor interno\n(7) Terminar\n");
			String option = sc.nextLine();

			switch (option) {

			case "1":
				objeto.suma();
				break;

			case "2":
				objeto.resta();
				break;

			case "3":
				objeto.getDoble();
				break;

			case "4":
				objeto.getTriple();
				break;

			case "5":
				objeto.getValor();
				break;

			case "6":
				objeto.Reset();
				break;

			case "7":
				loop = false;
				break;

			default:
				System.out.println("Me vas a comer los [con cariño]\n");
				break;
			}
		} while (loop);

		System.out.println("Chao campeón");
		sc.close();
	}
}