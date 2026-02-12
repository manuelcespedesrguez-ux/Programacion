package Mapas;

import java.util.ArrayList;

public class PuntuacionMano {

    public static void main(String[] args) {
        ArrayList<CartaBaraja> mano = new ArrayList<CartaBaraja>();

        while (mano.size() < 5) {
            CartaBaraja carta = new CartaBaraja();
            if (!mano.contains(carta)) {
                mano.add(carta);
            }
        }

        mano.sort((o1, o2) -> o1.compareTo(o2));

        CartaBaraja.puntosCartas();

        System.out.println("Puntúa tu mano: ");

        int total = 0;
        for (CartaBaraja carta : mano) {
            System.out.println(carta);
            total += CartaBaraja.puntos.getOrDefault(carta.getValor(), 0);
        }

        System.out.println("Tienes: " + total + " puntos");
    }
}