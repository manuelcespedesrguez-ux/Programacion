package Herencia;

public class TestPelinMasComplejo {

    public static void main(String[] args) {
        
        Cuenta pepe = new Cuenta(500f, 1.5f);
        System.out.println(pepe);

        pepe.consignar(200f);
        System.out.println(pepe);

        pepe.retirar(100f);
        System.out.println(pepe);

        pepe.extractoMensual();
        System.out.println(pepe);

        CuentaAhorro pepeAhorra = new CuentaAhorro(12456f, 2.5f);
        System.out.println(pepeAhorra);

        pepeAhorra.consignar(1000f);
        System.out.println(pepeAhorra);

        pepeAhorra.retirar(500f);
        System.out.println(pepeAhorra);

        pepeAhorra.extractoMensual();
        System.out.println(pepeAhorra);

        CuentaCorriente pepeCorriente = new CuentaCorriente(500f, 1.5f);
        System.out.println(pepeCorriente);

        pepeCorriente.retirar(600f);
        System.out.println(pepeCorriente);

        pepeCorriente.consignar(200f);
        System.out.println(pepeCorriente);

    }

}
