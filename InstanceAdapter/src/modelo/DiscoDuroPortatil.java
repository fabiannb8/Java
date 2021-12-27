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
public class DiscoDuroPortatil {
    
    private boolean conectado;

    public DiscoDuroPortatil() {
        this.conectado = false;
    }
    
    public String conectarAlPuertoUSB(){
        if (!conectado) {
            conectado = true;
            return "Disco duro portatil conectado.";
        }else{
            return "El disco duro portatil ya esta conectado.";
        }
    }
    
    public String desconectarDelPuertoUSB(){
        if (conectado) {
            return "Disco duro portatil desconectado.";
        }else{
            return "El disco duro portatil ya esta desconectado.";
        }
    }
    
    public String almacenarInfo(){
        return "Informacion almacenada correctamente dentro "
                + "de la unidad de disco duro portatil.";
    }
    
    public String borrarInfo(){
        return "Informacion eliminada con exito dentro de la unidad "
                + "de disco duro portatil.";
    }
}
