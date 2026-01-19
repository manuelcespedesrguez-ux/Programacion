public class Cadenas7 {

    public static void main(String[] args) {

        String cad1 = "MAYKA";
        String cad2 = cad1.trim();
        System.out.println(cad2.toString());

        String cad3 = "PEDRO Ruiz";
        String cad4 = cad3.toLowerCase();
        System.out.println(cad4.toString());

        String cad5 = "Juan Suarez", cad6 = cad5.replace('U', 'O');
        System.out.println(cad6.toString());

        String cad7 = "JUAN CARLOS MORENO";
        System.out.println(cad7.substring(5,11));

        System.out.println(cad7.substring(12));
    }
}