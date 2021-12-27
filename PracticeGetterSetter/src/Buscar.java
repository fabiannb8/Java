/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabiannb8
 */
public class Buscar {
    private String texto;
    private String contenido ="undefined";
  
    
    public Buscar(){
        System.out.println("Busqueda Establelcida");
    }
    public Buscar(String texto){
        this.texto=texto;
        System.out.println("Busqueda solo por texto");
    }
    public Buscar(String texto, String contenido){
        this.texto=texto;
        this.contenido=contenido;
        System.out.println("Esta es la busqueda por contenido (Documento, Imagen o Video)");
    }

    public ResultadoBusqueda buscar(){
        return new ResultadoBusqueda();
    }
    
}
