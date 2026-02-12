package Mapas;

import java.util.HashMap;
import java.util.Objects;
import java.util.Random;

public class CartaBaraja implements Comparable<CartaBaraja> {

    public static HashMap<Valor, Integer> puntos = new HashMap<>();

    public static void puntosCartas() {
        puntos.put(Valor.DOS, 0);
        puntos.put(Valor.TRES, 10);
        puntos.put(Valor.CUATRO, 0);
        puntos.put(Valor.CINCO, 0);
        puntos.put(Valor.SEIS, 0);
        puntos.put(Valor.SIETE, 0);
        puntos.put(Valor.SOTA, 2);
        puntos.put(Valor.CABALLO, 3);
        puntos.put(Valor.REY, 4);
        puntos.put(Valor.AS, 11);
    }

    public enum Valor {
        AS, DOS, TRES, CUATRO, CINCO, SEIS, SIETE, SOTA, CABALLO, REY
    }
    
    public enum Palos {
        COPAS, ESPADAS, BASTOS, OROS
    }
    
    Valor valor;
    Palos palo;

    public CartaBaraja() {
        Random random = new Random();
        Valor[] arrayValores = Valor.values(); 
        Palos[] arrayPalos = Palos.values();
        this.valor = arrayValores[random.nextInt(arrayValores.length)];
        this.palo = arrayPalos[random.nextInt(arrayPalos.length)];
    }

    @Override
    public int compareTo(CartaBaraja otra) {

        if (this.palo != otra.palo) {
            return this.palo.compareTo(otra.palo);
        }
        return this.valor.compareTo(otra.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(palo, valor);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        CartaBaraja otra = (CartaBaraja) obj;
        return palo == otra.palo && valor == otra.valor;
    }

    public Valor getValor() {
        return valor;
    }

    public Palos getPalo() {
        return palo;
    }

    @Override
    public String toString() {
        return "CartaBaraja [valor=" + valor + ", palo=" + palo + "]";
    }
}