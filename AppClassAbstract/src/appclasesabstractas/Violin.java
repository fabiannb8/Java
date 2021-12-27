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
public class Violin extends InstrumentoMusical implements InstrumentoAfinable{

    @Override
    public void tocar() {
        System.out.println("Tocando Violin");
    }

    @Override
    public void afinar() {
        System.out.println("Afinando violin");
    }
    
}
