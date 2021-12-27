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
public class EjercicioJugadoresPolimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jugador jugador1 = new Defensa();
        Jugador jugador2 = new Delantero();
        
        jugador1.nombre();
        jugador1.posicion();
        jugador1.velocidad();
        
        jugador2.nombre();
        jugador2.posicion();
        jugador2.velocidad();
        
        
    }
    
}
