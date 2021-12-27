/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Relaciones;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fabian
 */
public class AplicacionContactos {
    private List<Contacto> contactos;
    
    public AplicacionContactos(){
      this.contactos = new ArrayList<>(); 
    }
    
    public void agregarContacto(Contacto contacto) {
        System.out.println("Se ha agregado un contacto");
        this.contactos.add(contacto);
    }
}
