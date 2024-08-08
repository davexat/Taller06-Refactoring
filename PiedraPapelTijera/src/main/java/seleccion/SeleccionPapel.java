/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seleccion;

/**
 *
 * @author Pc
 */
public class SeleccionPapel implements Seleccion{
    @Override
    public boolean esGanador(Seleccion s) {
        return s instanceof SeleccionPiedra;
    }
    @Override
    public String toString(){
        return "paper   ";
    }
}