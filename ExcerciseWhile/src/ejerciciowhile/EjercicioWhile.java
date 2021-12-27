/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciowhile;

import javax.swing.JOptionPane;

/**
 *
 * @author fabiannb8
 */
public class EjercicioWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 10;
        int b = Integer.parseInt(JOptionPane.showInputDialog(null,"Coloque un numero menor a 10"));
        
        while (a>b) {
            JOptionPane.showMessageDialog(null, a+" es mayor que "+b);
            System.out.println(b);
            if (b==(a-1)) {
                JOptionPane.showMessageDialog(null, (b+1)+" es igual a 10");
            }
            b++;
        }
    }
    
}
