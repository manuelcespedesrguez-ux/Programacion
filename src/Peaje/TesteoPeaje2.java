package Peaje;

import java.util.ArrayList;
import java.util.List;

public class TesteoPeaje2 {
    
    public static void main(String[] args) {

     Peaje peajesito = new Peaje("Peaje de Rande", "Pontevedra");
     List<Persona> personas = new ArrayList<>();

        // Ahora creamos a hyundai, volskwagen y seat
        Carro hyundai = new Carro("7167 MAG");
        Carro volskwagen = new Carro("7822 NBC");
        Carro seat = new Carro("1904 MCK");

        Persona juanvitrasa = new Persona("Juan", "Vitrasa", 35589524, 02, 06, 1985);
        personas.add(juanvitrasa);
        Persona pepe = new Persona("Pepe", "Domínguez", 7729632, 06, 02, 1967);
        personas.add(pepe);
        Persona sergio = new Persona("Sergio", "Álvarez", 34987524, 31, 12, 2003);
        personas.add(sergio);

        // Asignamos los coches a estos personajes
        juanvitrasa.asignarVehiculo(seat);
        pepe.asignarVehiculo(hyundai);
        sergio.asignarVehiculo(volskwagen);

        // Continuamos creando a yamaraha, hondita y sizuka 
        Moto yamarada = new Moto("5794 KKW");
        Moto hondita = new Moto("6435 NPC");
        Moto sizuka = new Moto("8462 MFK");

        // Asignamos las motos a estos personajes
        juanvitrasa.asignarVehiculo(yamarada);
        pepe.asignarVehiculo(hondita);
        sergio.asignarVehiculo(sizuka);

        // Por último tocan los camionsitos 
        Camion pegado = new Camion("4682 NDC",  6);
        Camion escania = new Camion("2833 KWH", 5);
        Camion mercedes = new Camion("3394", 8);

        // Asignamos los camiones a estos personakes
        juanvitrasa.asignarVehiculo(mercedes);
        pepe.asignarVehiculo(pegado);
        sergio.asignarVehiculo(escania);

        // Ahora toca A PAGAR A PAGAR
        peajesito.calcularPeaje(mercedes);
        peajesito.calcularPeaje(pegado);
        peajesito.calcularPeaje(escania);
        peajesito.calcularPeaje(seat);
        peajesito.calcularPeaje(hyundai);
        peajesito.calcularPeaje(volskwagen);
        peajesito.calcularPeaje(yamarada);
        peajesito.calcularPeaje(hondita);
        peajesito.calcularPeaje(sizuka);

        System.out.println("Total pagado por cada persona en el peaje de Rande:");
        peajesito.imprimirMTotal(juanvitrasa);
        peajesito.imprimirMTotal(pepe);
        peajesito.imprimirMTotal(sergio);
    }

}
