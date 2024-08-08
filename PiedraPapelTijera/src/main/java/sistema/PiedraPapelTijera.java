/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package sistema;

import juego.Juego;
import juego.Jugador;

/**
 *
 * @author Pc
 */
public class PiedraPapelTijera {

    public static void main(String[] args) {
        Juego juego = new Juego();
        Jugador jugador1 = new Jugador("Player 1");
        Jugador jugador2 = new Jugador("Player 2");
        juego.realizarPartida(jugador1, jugador2); 
    }
}
