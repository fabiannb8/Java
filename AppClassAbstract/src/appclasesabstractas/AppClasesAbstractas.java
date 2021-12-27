/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appclasesabstractas;

/**
 *
 * @author fabiannb8
 */
public class AppClasesAbstractas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Piano piano = new Piano();
        piano.tocar();
        piano.detener();
        
        Guitarra guitarra= new Guitarra();
        guitarra.afinar();
        guitarra.tocar();
        guitarra.detener();
        
        Violin violin = new Violin();
        violin.afinar();
        violin.tocar();
        violin.detener();
    }
    
}
