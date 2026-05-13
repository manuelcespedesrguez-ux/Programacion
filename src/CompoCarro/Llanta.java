package CompoCarro;

public class Llanta {
    
    String marca;
    int diametroRin;
    int altura;
    int anchura;

    public Llanta(String marca, int diametroRin, int altura, int anchura) {
        this.marca = marca;
        this.diametroRin = diametroRin;
        this.altura = altura;
        this.anchura = anchura;
    }

    public void imprimir() {
        System.out.println("Las llantas de la marca " + marca + ", tienen un diámetro de " + diametroRin + ", una altura de " + altura + " y una anchura de " + anchura);
    }

}
