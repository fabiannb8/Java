/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciojugadorespolimorfismo;

/**
 *
 * @author fabiannb8
 */
public class Delantero extends Jugador{
    public void nombre(){
        System.out.println("Nombre: Juan");
    }
    public void posicion(){
        System.out.println("Posición del jugador: Delantero central");
    }
    public void velocidad(){
       System.out.println("Velocidad del delantero es: "+85);
   }
}
