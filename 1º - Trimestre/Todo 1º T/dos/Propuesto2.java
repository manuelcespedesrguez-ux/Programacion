package dos;

import java.util.Objects;

public class Propuesto2 {

	int num;
	
	Propuesto2(int n) {
		this.num=n;
	}
	
	Propuesto2(Propuesto2 obj){
		this.num= obj.num;
		System.out.println("Hemos creado una copia de "+obj.toString());
	}
	
	public int getnum() {
		return this.num;
	}
	
	public void setNum(int n) {
		this.num=n;
	}
	
	public int doble() {
		return 2*this.num;
	}
	
	

	public int triple() {
		return 3*this.num;
	}
	
	public int cuadruple() {
		return 4*this.num;
	}

	@Override
	public String toString() {
		return "Propuesto2 [num=" + num + ", doble()=" + doble() + ", triple()=" + triple() + ", cuadruple()=" +cuadruple() +"]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(num);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Propuesto2 other = (Propuesto2) obj;
		return num == other.num;
	}

}
