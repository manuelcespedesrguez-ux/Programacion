package Inicio;

public class Cadenas6 {
    
    @SuppressWarnings("StringEquality")
    public static void main(String[] args) {
        String cad1 = "EMMA";
        @SuppressWarnings("RedundantStringConstructorCall")
        String cad2 = new String("EMMA");

        if (cad1.equals(cad2)) {
            System.out.println("SON IGUALES");
        }

        if (cad1 == cad2) {
            System.out.println("SON IGUALES");
        } else {
            System.out.println("SON DIFERENTES");
        }

        @SuppressWarnings("unused")
        String cad3 = cad1;
    }
}
