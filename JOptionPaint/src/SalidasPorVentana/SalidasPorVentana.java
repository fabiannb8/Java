/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SalidasPorVentana;

import javax.swing.JOptionPane;

/**
 *
 * @author fabiannb8
 */
public class SalidasPorVentana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       String palabra = JOptionPane.showInputDialog(null,"Ingresa una palabra");
       JOptionPane.showMessageDialog(null, "La palabra ingresada es "+palabra);
       
       
    }
    
}
