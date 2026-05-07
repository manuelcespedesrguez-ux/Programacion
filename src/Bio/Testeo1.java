package Bio;

public class Testeo1 {
    
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        
        /*Animal sobera = new Animal("ewrg!", "kiwis", "navideño", "Cejus hispanicus");

        Canido toralla = new Canido("brupp", "bichotas", "marino", "Carolus maritumus");*/

        Canido mafalda = new Perro("Gufff", "salchicas", "pisero", "Mafaldus galaicus");
        Animal feroz = new Lobo("Auuuuu", "Abuelitas", "Bosques de peru", "Canis complutensis");

        Felino simba = new Leon("Roarr", "Carne", "Sabana", "Panthera Quevedo");
        Animal conbotas = new Gato("Rauuu", "Atún", "Mi casa", "Felicius calamardus");

        System.out.println(mafalda.toString());
        System.out.println(feroz.toString());
        System.out.println(simba.toString());
        System.out.println(conbotas.toString());

        System.out.println(mafalda instanceof Perro); // True
        System.out.println(feroz instanceof Animal); // Pues da true porque al final si que es un animal
        System.out.println(mafalda instanceof Lobo); // False
        System.out.println(feroz instanceof Lobo); // True
        System.out.println(simba instanceof Leon); // True  
        System.out.println(conbotas instanceof Gato); //True
    
        // Downcasting de los cuatro refencias
        Perro p =  (Perro) mafalda; 
        Canido ca = (Canido) feroz;
        Lobo lo = (Lobo) feroz;
        Leon le = (Leon) simba;
        // Gato ga = (Perro) conbotas;
        Felino fe = (Felino) conbotas;

    }

}
