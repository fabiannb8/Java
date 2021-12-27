/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Relaciones;

/**
 *
 * @author Fabian
 */
public class Aplicacion {
    
    public static void main(String[] args) {
        
        TelefonoMovil movil = new TelefonoMovil();
        movil.encender();
        
        Contacto contacto1 = new Contacto ("Juan");
        movil.agregar(contacto1);
        
        Contacto contacto2 = new Contacto ("Pedro");
        movil.agregar(contacto2);
    }
    
}
