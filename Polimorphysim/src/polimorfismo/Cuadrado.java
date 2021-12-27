/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author fabiannb8
 */
public class Cuadrado extends Figura {
    private int lado=3;
    
    public void area(){
        System.out.println("El area del cuadrado es: "+(lado*lado));
    }
    
}
