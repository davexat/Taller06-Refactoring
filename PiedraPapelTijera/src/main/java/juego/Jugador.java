/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego;

import java.util.Random;
import seleccion.*;

/**
 *
 * @author Pc
 */
public class Jugador {
    private String nombre;
    private int rondasGanadas;
    private Seleccion seleccion;
    public Jugador(String nombre){
        this.nombre = nombre;
        this.rondasGanadas = 0;
        seleccion = null;
    }
    public int getRondasGanadas(){
        return rondasGanadas;
    }
    public void aumentarRondasGanadas(){
        rondasGanadas++;
    }
    public void realizarSeleccion(){
        Random random = new Random();
        int numeroAleatorio = random.nextInt(3) + 1;
        switch(numeroAleatorio){
            case 1 -> { seleccion = new SeleccionPapel();  }
            case 2 -> { seleccion = new SeleccionPiedra(); }
            case 3 -> { seleccion = new SeleccionTijera(); }
        }
    }
    public Seleccion getSeleccion(){
        return seleccion;
    }
    @Override
    public String toString(){
        return nombre;
    }
}
