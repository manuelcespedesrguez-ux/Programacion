package Mapas;

import java.util.Random;

public class Carta implements Comparable<Carta> {

    enum valores {
        AS, DOS, TRES, CUATRO, CINCO, SEIS, SIETE, SOTA, CABALLO, REY
    }

    enum palos {
        OROS, COPAS, ESPADAS, BASTOS
    }

    // Atributos
    String valor;
    String palo;

    // Constructor
    Carta() {
        Random random = new Random();

        // Generamos un array de valores y un array de palos
        valores[] arrayvalores = valores.values();
        palos[] arrayPalos = palos.values();

        this.valor = arrayvalores[random.nextInt(arrayvalores.length)].name();
        this.palo = arrayPalos[random.nextInt(arrayPalos.length)].name();
    }

    @Override
    public String toString() {
        return "Carta [valor=" + valor + ", palo=" + palo + "]";
    }

    // No se ponen setters porque una carta no debería ser modficada una vez creada, pero sí getters para poder acceder a sus atributos
    public String getValor() {
        return valor;
    }

    public String getPalo() {
        return palo;
    }

    // 6. Comparación mejorada --> Primero ordena por palo y en caso de igualdad de palo ordena por valor
    // Este método permitirá comparar dos objetos cartas y ordenarlos según el
    // criterio de su interior
    @Override
    public int compareTo(Carta otra) {
        // Primero comparamos por palo
        int comPalo = this.getPalo().compareTo(otra.getPalo());
        if (comPalo != 0) {
            return comPalo;
        }
        // Si los palos son iguales, comparamos por valor
        return this.valor.compareTo(otra.valor);
    }

}
