/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifelseanidado;

import javax.swing.JOptionPane;

/**
 *
 * @author fabiannb8
 */
public class IfElseAnidado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a= Integer.parseInt (JOptionPane.showInputDialog(null, "Ingrese el primer numero"));
        int b= Integer.parseInt (JOptionPane.showInputDialog(null, "Ingrese el segundo numero"));
        int c= Integer.parseInt (JOptionPane.showInputDialog(null, "Ingrese el último numero"));
        
        if (a>b) {
            if (a>c) {
                JOptionPane.showMessageDialog(null, "El primer numero es el mayor");
            }
                     
        }else if (b>a) {
            if (b>c) {
                JOptionPane.showMessageDialog(null, "El segundo numero es el mayor");
            }else{
                JOptionPane.showMessageDialog(null, "El tercero es el numer mayor");
            }            
        }
        
        
    }
    
}
