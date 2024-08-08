/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego;

import java.util.ArrayList;

/**
 *
 * @author Pc
 */
public class Juego {
    private ArrayList<Ronda> rondasJugadas;
    private int empates;
    public Juego(){
        rondasJugadas = new ArrayList<>();
        empates = 0;
    }
    public void realizarPartida(Jugador jugador1, Jugador jugador2){
        while (jugador1.getRondasGanadas() < 3 && jugador2.getRondasGanadas() < 3){
            Ronda ronda = new Ronda(jugador1, jugador2);
            rondasJugadas.add(ronda);
            System.out.println("**** Round: " + rondasJugadas.size() + " ***********");
            System.out.println("Number of Draws: " + empates);
            boolean noEmpate = ronda.realizarJuego();
            if (!noEmpate) empates ++;
        }
        System.out.println("GAME WON");
    }
}
