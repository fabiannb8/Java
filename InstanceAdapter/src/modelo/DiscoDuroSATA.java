/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Next University
 */
public class DiscoDuroSATA extends DiscoDuro{
    
    @Override
    public String almacenar(){
      return "Informacion almacenada de manera correcta en el disco duro SATA";
    }

    @Override
    public String borrar() {
      return "Informacion borrada de manera correcta en el disco duro SATA";  
    }
}
