/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego;

import seleccion.Seleccion;

/**
 *
 * @author Pc
 */
public class Ronda {
    private Jugador jugador1;
    private Jugador jugador2;
    public Ronda(Jugador jugador1, Jugador jugador2){
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
    }
    public Jugador getJugador1(){
        return jugador1;
    }
    public Jugador getJugador2(){
        return jugador2;
    }
    public boolean realizarJuego(){
        jugador1.realizarSeleccion();
        jugador2.realizarSeleccion();
        imprimirJugadores();
        Seleccion seleccionJugador1 = jugador1.getSeleccion();
        Seleccion seleccionJugador2 = jugador2.getSeleccion();
        final boolean ganaJugador1 = seleccionJugador1.esGanador(seleccionJugador2);
        final boolean ganaJugador2 = seleccionJugador2.esGanador(seleccionJugador1);
        Jugador ganador = null;
        if      (ganaJugador1) ganador = jugador1;
        else if (ganaJugador2) ganador = jugador2;
        return verificarGanador(ganador);
    }
    private boolean verificarGanador(Jugador ganador){
        if (ganador != null) ganador.aumentarRondasGanadas();
        imprimirResultado(ganador);
        return ganador != null;
    }
    private void imprimirResultado(Jugador ganador){
        if (ganador == null) System.out.println("\n\t\t\t Draw \n");
        else System.out.println(ganador + " Wins");
    }
    private void imprimirJugadores(){
        System.out.println(jugador1 + ": " 
                + jugador1.getSeleccion() + "\t " 
                + jugador1 + " Total Wins: " + jugador1.getRondasGanadas());
        System.out.println(jugador2 + ": " 
                + jugador2.getSeleccion() + "\t " 
                + jugador2 + " Total Wins: " + jugador2.getRondasGanadas());
    }
}
