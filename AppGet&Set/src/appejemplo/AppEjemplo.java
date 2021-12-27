/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appejemplo;

/**
 *
 * @author fabiannb8
 */
public class AppEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cine cine = new Cine();
        cine.setDireccion("Calle 5");
        System.out.println(cine.getDireccion());
        System.out.println(cine.getId());
        
    }
    
}
