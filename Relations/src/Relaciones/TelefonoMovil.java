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
public class TelefonoMovil {
    
    private Bateria bateria;
    private AplicacionContactos aplicacionDeContactos;
        
    
    public TelefonoMovil(){
        this.bateria = new Bateria();
        this.aplicacionDeContactos = new AplicacionContactos();
}
    public void agregar(Contacto contacto){
        this.aplicacionDeContactos.agregarContacto(contacto);
    }
    public void encender(){
        System.out.println("¡Encender teléfono!");
        System.out.println("El porcentaje de la batería es: " + bateria.porcentajeBateria() + "%");    
    }
    
    public class Bateria {
        
        public int porcentajeBateria(){
            return (int) (Math.random() * 100);
        }
    }
    
}
