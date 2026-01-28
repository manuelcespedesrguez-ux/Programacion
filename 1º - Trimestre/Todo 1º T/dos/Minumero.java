package dos;

import java.util.Objects;
import java.util.Scanner;

public class Minumero {

	int numero;
	Scanner sc = new Scanner(System.in);

	public Minumero() {
		this.numero = 0;
	}

	public Minumero(int n) {
		this.numero = n;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int n) {
		this.numero = n;
	}

	public void suma() {
		System.out.println("Dime un número: ");
		int sumando = sc.nextInt();
		int suma = this.numero + sumando;
		System.out.println(getNumero() + " + " + sumando + " = " + suma + "\n");
		this.numero = suma;
	}

	public void resta() {
		System.out.println("Dime otro número: ");
		int sustraendo = sc.nextInt();
		int diferencia = this.numero - sustraendo;
		System.out.println(getNumero() + " - " + sustraendo + " = " + diferencia + "\n");
		this.numero = diferencia;
	}

	public void getDoble() {
		int doble = getNumero() * 2;
		System.out.println("El doble de " + getNumero() + " es " + doble + "\n");
		this.numero = doble;
	}

	public int getTriple() {
		int triple = getNumero() * 3;
		System.out.println("El triple de " + getNumero() + " es " + triple + "\n");
		return this.numero = triple;
	}

	public void getValor() {
		System.out.println("El valor es: " + this.numero + "\n");
	}

	public void Reset() {
		this.numero = 0;
		System.out.println("Valor reseteado\n");
	}

	Minumero(Minumero nuevo) {
		this.numero = nuevo.numero;
	}

	@Override 
	public String toString() {
		return "Minumero [numero=" + numero + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(numero);
	}

	@Override 
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Minumero other = (Minumero) obj;
		return numero == other.numero;
	}
}