/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appcine;

/**
 *
 * @author fabiannb8
 */
public class Cine {
    private String telefono;
    private String direccion;

    public Cine() {
        this.telefono = "123";
        this.direccion = "Calle 333";
        System.out.println("Esto es un constructor sencillo");
    }
    public Cine(String direccion) {
        this.telefono = "123456";
        this.direccion = "Calle 666";
        System.out.println("Esto es un constructor con dirección");
    }
    
    
    
    public Cine(String telefono, String direccion) {
        this.telefono = "123465789";
        this.direccion = "Calle 999";
        System.out.println("Esto es un constructor con dirección y teléfono");
    }
}
