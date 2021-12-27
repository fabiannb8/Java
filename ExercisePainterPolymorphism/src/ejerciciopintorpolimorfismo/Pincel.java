/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopintorpolimorfismo;

/**
 *
 * @author fabiannb8
 */
public class Pincel extends AplicacionDeDibujo{
    private boolean seco;
    private int diametro;
    
    public void pincelNatural(){
        seco=true;
        diametro=10;
        System.out.println("Estas usando un pincel Natural "+seco+" diametro: "+diametro);
    }
    
}
